In generale il formato dei TCP/UDP è quello di oggetti formate da parole, a 32 bit. 16 bit sono dedicati a identificare la porta sorgente, gli altri 16 la porta destinazione. Il multiplexing e demultiplexing si basano sui numeri di porta e indirizzi IP del mittente e destinatario finale.
Il TCP è connection oriented, usa socket differenti in funzione di 4 parametri: IP e porta di origine e destinazione.
Tutte queste informazioni vengono tenute in un unico buffer.
## Perché usare UDP?
Non fa aggiunta di necessità di computazione, non fa aggiunta di richieste di stato e quindi è più veloce ed è usato per applicazioni real time. Tutto questo valeva fino a quando si aveva poca banda a disposizione, e questo influiva sulla perdita di pacchetti. Dal momento che le reti di tutto il mondo (anche wireless) hanno più banda, il problema di perdere pacchetti sparisce e quindi UDP è sempre meno usato.
TCP richiede troppo, UDP fa troppo poco, quindi l'aumento di banda è un problema per entrambi i protocolli.
R-UDP è una forma di UDP più affidabile, che si ottiene  garantendo controlli a livello di ricezione al di sopra del livello trasporto.
L'UDP checksum rileva errori sui bit del segmento: il sender considera i dati come interi a 16 bit, la checksum somma gli interi e fa il complemento a 1 e inserisce il valore della somma nel campo checksum del segmento (metodo bit di parità) . Il receiver calcola la somma di controllo dei dati ricevuti e se ci sono errori elimina i dati. 
Più garanzie vuoi sulle capacità di trovare errori, più bit devi avere a disposizione. Servirebbero 16 bit per rilevare gli errori su un una parola di 16 bit. Quindi essere in grado rilevare errori su tutto Internet, su tutti i dati in circolazione implicherebbe effettivamente raddoppiare la quantità di dati.
Come si fa a creare un servizio affidabile basato su un protocollo di trasferimento dati inaffidabile?
1. Il canale ha primitive che spediscono dati senza garanzie, bisogna costruire sopra un sistema che è affidabile, sia in termini di spedizione che in termini di ricezione. 
2. Se la rete non crea bit errati e non si perdono pacchetti allora basta uno stato solo che si sposta dal lato mittente a quello ricevente.
3. Supponiamo che la rete possa cambiare il valore dei bit, ma ancora non perde pacchetti. In situazioni con bit errati, ci sono Acknowledgements (ACKs) che mandano al mittente un pacchetto per dire che i dati sono ok. In caso di dati sbagliati vengono inviati NACKs al mittente, che poi ritrasmette dati. Cosa succede se anche nei ACK e nei NACK c'è un'errore di trasmissione dei pacchetti (bit errati su ACK e NACK)? In questi casi si ritrasmette il vecchio pacchetto. Per distinguere i duplicati si assegna un numero di sequenza ad ogni pacchetto, e in caso di errori nella ricezione dei ACK/NACK si chiede di rispedire il pacchetto con lo stesso numero.
![](https://cdn.discordapp.com/attachments/709137329129914451/1087384707509014728/image.png)
4. Eliminiamo NACK: tutte le informazioni gestite usando il NACK si possono gestire solamente con l'ACK. Se il ==sender riceve ACK duplicati li interpreta come NACK e ritrasmette il pacchetto successivo a quello a cui si riferisce l’ACK duplicato==.
5. Rete con errori su bit e *perdita* di pacchetti: l'algoritmo visto finora funziona su una rete sincrona. Se ci si trova su una rete asincrona (Internet), dove per ogni spedizione non è dato il tempo massimo per ricevere una risposta, questo algoritmo non funziona più. Per ovviare a questo problema il sender attende l'ACK in un tempo ragionevole. Se il pacchetto dati arriva dopo il timeout allora si è trasmesso un duplicato, ma il numero di sequenza risolve già il problema sul receiver, che deve specificare il numero di pacchetto del quale invia l'ACK.
## GoBackN e Selective Repeat
Sender e receiver devono avere spazio in memoria: 
Selective a differenza di go-Back ammette riempimento di buffer con buchi, che dal lato receiver significa che vengono accettati pacchetti anche in ordine non sequenziale. Selective riceve blocchi di pacchetti ordinati.
Entrambe usano il principio di bufferizzazione per ricordare quali pacchetti sono già stati spediti.

TCP è un protocollo a pipeline basato su buffer tra sender e receiver.
Come funzionano quei meccanismi che fanno si che TCP garantisca anche il controllo del flusso e della congestione.
Per congestione si intende quando i vari router non si trovano in grado di ricevere pacchetti (finisce lo spazio in memoria) e quindi li scartano.
Perché non si aggiunge un ulteriore protocollo suoi router per evitare la congestione?
Perché rallenterebbe molto Internet, creerebbe ancora più congestione. La soluzione semplice adottata è quella di responsabilizzare i sender e receiver, che si autoregolano nella spedizione di pacchetti.