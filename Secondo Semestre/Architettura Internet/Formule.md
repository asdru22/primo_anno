### Banda ($R\ \Big[\frac{\textup{bit}}{s}\Big]$)
### Distanza ($D\ [m]$)
### Lunghezza pacchetto ($L\ [\textup{bit}]$)
### Dimensione pacchetto ($F\ [\textup{bit}]$)
### Round Trip Time ($RTT\ [s]$)
### Velocità di propagazione ($v_p\ [\frac{m}{s}]$)
### Numero di pacchetti ($N$)
$$N=\frac{F}{L}$$
### Delay di propagazione ($d_p$)
$$d_p=\frac{D}{v_p}\ \Big[\frac{m}{\frac{m}s}=s\Big]$$
### Delay di trasmissione ($d_t$)
$$d_t=\frac{F}{R}\ \Big[\frac{\textup{bit}}{\frac{\textup{bit}}s}=s\Big]$$
Nel caso di una connessione con $N$ connessioni parallele,
$$d_t=\frac{L\times N}{R}\ \Big[\frac{\textup{bit}}{\frac{\textup{bit}}{s}}=s\Big]$$
### Delay di accodamento ($d_a$)
$$d_a=\textup{numero medio di pacchetti in coda}\cdot d_t\ [s]$$
### Delay end to end ($d_e$)
$$d_e=d_p+d_t+d_a+\textup{ritardo di elaborazione}\ [s]$$
Solitamente, $d_e=\frac{RTT}2$
### Troughput File ($T$)
$$T_{max}=R\ \Big[\frac{\textup{bit}}{s}\Big]$$
Nel caso di una rete con collegamenti multipli, si considera il collegamento con banda più bassa.
$$\bar{T}=\frac{F}{t_{tot}}\ \Big[\frac{\textup{bit}}{\textup s}\Big]$$
### Tempo totale di trasmissione ($t_{tot}$)
Se il file è trasmesso come flusso continuo di pacchetti
$$t_{tot}=d_p+N\times d_t\ [s]$$
Se il file è trasmesso pacchetto per pacchetto
$$t_{tot}=N\times d_p+N\times d_t\ [s]$$
### Bandwidth Delay Product ($BDP$)
$$BDP=d_p\times R\ [\textup{bit}]$$
### Perdita di pacchetti
$$N_{persi}=N\times P_{perdita}$$
### Tempo di perdita ($T_{perdita}$)
Tempo totale impiegato per la trasmissione di un file supponendo che i pacchetti possano essere persi        
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
## RTT Stimato ($E_{RTT}$)
$$E_{RTT}=(1-x)\times E_{RTT}'+x\times\textup{Sample RTT}\ [s]$$
Solitamente $x=\frac{1}{8}$
## Deviazione ($D_V$)
$$D_V=(1-y)\times D_V'+y\times|\textup{Sample RTT}-E_{RTT}|\ [s]$$
Solitamente $y=\frac 1 4$
## Timeout ($T_O$)
$$T_O=E_{RTT}+4\times D_V\ [s]$$
## Finestra di congestione ($w\ [s]$)
Diciamo $W$ il valore di $w$ al timeout (costante)
## Frequenza trasmissiva ($F_t$)
$$F_t=\frac w {RTT}$$
Mediamente è 
$$F_t=\frac{0,75\times W}{RTT}$$
## Finestra di congestione massima ($CW$)
$$CW=RTT\times R\ [\textup{bit}]$$
In segmenti:
$$CW_{max}=\frac{RTT\times R}{L}\ (\textup{segmenti})$$