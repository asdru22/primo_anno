### Banda ($R\ \Big[\frac{\textup{bit}}{s}\Big]$)
### Distanza ($D\ [m]$)
### Lunghezza pacchetto ($L\ [\textup{bit}]$)
### Dimensione pacchetto ($F\ [\textup{bit}]$)
### Numero di pacchetti ($N$)
$$N=\frac{\textup{dimensione pacchetto}}{\textup{lunghezza pacchetto}}$$

### Delay di propagazione ($d_p$)
$$d_p=\frac{\textup{distanza tra nodi}}{\textup{velocità di propagazione}}\ \Big[\frac{m}{\frac{m}s}=s\Big]$$
### Delay di trasmissione ($d_t$)
$$d_t=\frac{\textup{dimensione del pacchetto }}{R}\ \Big[\frac{\textup{bit}}{\frac{\textup{bit}}s}=s\Big]$$
Nel caso di una connessione con $N$ connessioni parallele,
$$d_t=\frac{\textup{lunghezza pacchetto}\times N}{R}\ \Big[\frac{\textup{bit}}{\frac{\textup{bit}}{s}}=s\Big]$$
### Delay di accodamento ($d_a$)
$$d_a=\textup{numero medio di pacchetti in coda}\cdot d_t\ [s]$$
### Delay end to end ($d_e$)
$$d_e=d_p+d_t+d_a+\textup{ritardo di elaborazione}\ [s]$$
Solitamente, $d_e=\frac{\textup{round trip time}}2$
### Troughput ($T$)
$$T_{max}=R\ \Big[\frac{\textup{bit}}{s}\Big]$$
Nel caso di una rete con collegamenti multipli, si considera il collegamento con banda più bassa.
$$\bar{T}=\frac{\textup{dimensione pacchetto}}{t_{tot}}\ \Big[\frac{\textup{bit}}{\textup s}\Big]$$
### Tempo totale di trasmissione ($t_{tot}$)
Se il file è trasmesso come flusso continuo di pacchetti
$$t_{tot}=d_p+N\times d_t\ [s]$$
Se il file è trasmesso pacchetto per pacchetto
$$t_{tot}=N\times d_p+N\times d_t\ [s]$$
### Bandwidth Delay Product ($BDP$)
$$BDP=d_p\times R\ [\textup{bit}]$$
### Perdita di pacchetti
$$N_{persi}=N\times P_{perdita}$$
Tempo totale impiegato per la trasmissione di un file supponendo che i pacchetti possano essere persi:
$$T_{perdita}=(N+N_{persi})\times(d_p+d_t)\ [s]$$
### Tempo per eseguire *3-way handshake* ($d_{conn}$/$3WH$)
$$d_{conn}=3\times N\times d_p\ [s]$$
$$d_{conn}=3\times d_{syn}$$
### Tempo richiesto ai segmenti di ACK per arrivare a destinazione ($d_{syn}$/$d_{ack}$)
$$d_{syn}=N\times d_p\ [s]$$
### Connessioni parallele e non, persistenti e non
- Connessione non persistente e non parallela:
Per ogni file:
$$d_f=d_{conn}+N\times(d_{dati}+d_{syn})$$
$$d_c=\Sigma d_f$$
- Connessione persistente e non parallela
Per ogni file:
$$d_f=N\times(d_{dati}+d_{syn})$$
$$d_c=d_{conn}+\Sigma d_f$$
- Connessione non persistente, parallela
Per i file da mandare in parallelo:
$$d_{file\ par}=d_{conn}+N\times(d_{dati\ par}+d_{syn})$$
Per i file che eventualmente avanzano:
$$d_{file}=d_{conn}+N\times(d_{dati}+d_{syn})$$
$$d_c=d_{file\ par}+d_{file}$$