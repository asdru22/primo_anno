  ## Che cos'è Internet
Internet è un insieme di
- Dispositivi finali: dispositivi che possono in qualche modo accedere alla rete sui quali operano network applications.
- Nucleo centrale costituito da link di comunicazione o router.
- Protocolli: programma che soddisfa requisiti sia nel modo in cui funziona sia nel modo in cui funzionano i dati; è un programma di comunicazione. Si chiama protocollo perché si stanno rispettando delle regole. Devono soddisfare regole che sono diventate standard, emessi dall'IETF (Internet Engineering Task Force). Esempi di protocolli sono i TCP, IP, HTTP, FTP, PPP. Varianti di protocolli possono essere depositate come RFC (request for comments) per poi essere accettate o rifiutate, tuttavia il TCP è ormai invariato da 30 anni.
Un'infrastruttura di comunicazione permette alle applicazioni di essere distribute (World Wide Web, email, database).
Fornisce servizi di comunicazioni che possono essere:
- Senza connessione
- Orientati alla connessione
Differenza tra commutazione di circuito (precedente a Internet) e commutazione di pacchetto (antecedente a Internet).
Fino all'avvento della commutazione a pacchetto, la voce di un individuo, trasformata in segnale elettrico, doveva viaggiare su un filo di rame.
Negli anni '40 si decise di passare ad una struttura a stella, che aveva al centro un commutatore (elettromeccanico). In questo modo bastava stendere un cavo dalla propria abitazione fino al centro. In questo modo il numero di cavi richiesto per mettere in comunicazione $n$ persone non è più $n^2$, bensì $n$.
Sicuramente la commutazione di circuito è più veloce e sicura, tuttavia comporta un grande spreco di risorse dal momento che un singolo cavo connette solamente due individui.
Ci si chiede se fosse possibile trasformare il segnale elettrico in pacchetti digitali, costituiti da 1 e 0.
Al giorno d'oggi, usando le fibre ottiche, la velocità di trasmissione del segnale è leggermente rallentata, meno sicura ma consuma molte meno risorse.
Commutazione a circuito vs Commutazione a pacchetti:
- Circuit switching: circuito dedicato per utente.
- Packet switching: dati trasferita attraverso la rete in gruppi discreti.
Il protocollo TCP serve a risolvere eventuali perdite. I router non si accorgono quando i pacchetti presi in entrata vengono persi in uscita.
All'epoca il packet switching era visto inefficace per il trasporto di dati audio, il fenomeno della ==congestione== (ritardo di invio dei pacchetti dovuto ad una *queue*) non era così inibitorio per altre applicazioni legate alla comunicazione in tempo reale. Questo problema non riguarda applicazioni come email, prenotazioni, acquisti, . . .
Ormai i servizi di rete e anche le applicazioni sono diventate commodities che non ci si aspetta quasi di pagare, il loro valore è diminuito e quello che conta è solo il contenuto.

> Virtual circuit network ogni pacchetto contiene un ID del circuito virtuale che determina il prossimo salto. Il percorso fissato determinato nell'inizializzazione è fisso, e lo rimane nel corso di tutta la chiamata grazie ai router. Alla base vi è il packet switching, ma opera come se fosse un circuito (virtuale).

La frequenza massima della voce umana è di qualche migliaio di Hertz. Bisogna fare almeno 8000 campionamenti per trasformarla dall'analogico al digitale. Ogni campione è rappresentato almeno da un byte: $8000\times8\textup{b} = 64\textup{kb}$. Servono 64 kilobyte al secondo per convertire la voce in digitale.