|Prefisso|Simbolo|Notazione Scentifica|Numero Decimale|
|---|---|---|---|
|Giga|G|$10^9$|1 000 000 000|
|Mega|M|$10^6$|1 000 000|
|Chilo|K|$10^3$|1 000|
|Milli|m|$10^{-3}$|0,001|
|Micro|$\mu$|$10^{-6}$|0,000001|
|Nano|n|$10^{-9}$|0,0000000001|
### Banda ($R\ \Big[\frac{\textup{bit}}{s}\Big]$)
### Distanza ($D\ [m]$)
### Lunghezza pacchetto ($L\ [\textup{bit}]$)
### Dimensione file ($F\ [\textup{bit}]$)
### Round Trip Time ($RTT\ [s]$)
### Velocità di propagazione ($v_p\ [\frac{m}{s}]$)
### Numero di pacchetti ($N$)
$$N=\frac{F}{L}$$
### Delay di propagazione ($d_p$)
$$d_p=\frac{D}{v_p}\ \Big[\frac{m}{\frac{m}s}=s\Big]$$
### Delay di trasmissione ($d_t$)
$$d_t=\frac{L}{R}\ \Big[\frac{\textup{bit}}{\frac{\textup{bit}}s}=s\Big]$$
Nel caso di $\mathbb N$ ==connessioni parallele==,
$$d_t=\frac{L\times \mathbb N}{R}\ \Big[\frac{\textup{bit}}{\frac{\textup{bit}}{s}}=s\Big]$$
### Delay di accodamento ($d_a$)
$$d_a=\textup{numero medio di pacchetti in coda}\cdot d_t\ [s]$$
### Delay end to end ($d_e$)
$$d_e=d_p+d_t+d_a+\textup{ritardo di elaborazione}\ [s]$$
Nel caso di più link, si calcola il $d_e$ di ogni link
Solitamente, $d_e=\frac{RTT}2$
### Troughput File ($T$)
Quantità di ==dati che una rete effettivamente trasmette in un determinato periodo di tempo==
Collo da bottiglia = banda del collegamento con valore minore = $T_{max}$
$$T_{max}=R\ \Big[\frac{\textup{bit}}{s}\Big]$$
Nel caso di una rete con ==collegamenti multipli==, si considera il collegamento con ==banda più bassa==.
$$T_{medio}=\frac{F}{t_{tot}}\ \Big[\frac{\textup{bit}}{\textup s}\Big]$$
### Tempo impiegato da un file per attraversare un link ($t_{file}$)
Se il file è trasmesso come ==flusso continuo di pacchetti==
$$t_{file}=d_p+N\times d_t\ [s]$$
Se il file è trasmesso ==pacchetto per pacchetto==
$$t_{file}=N\times (d_p+ d_t)\ [s]$$
### Bandwidth Delay Product ($BDP$)
==Numero massimo di bit che possono essere presenti contemporaneamente sul collegamento== tra due nodi
$$BDP=d_p\times R\ [\textup{bit}]$$
### Perdita di pacchetti
$$N_{persi}=N\times P_{perdita}$$
### Tempo di perdita ($T_{perdita}$)
==Tempo totale impiegato per la trasmissione di un file supponendo che i pacchetti possano essere persi==
$$T_{perdita}=(N+N_{persi})\times(d_p+d_t)\ [s]$$
### Tempo per eseguire *3-way handshake* ($d_{conn}$/$3WH$)
$$d_{conn}=3WH=3\times d_{syn}=3\times d_p\ [s]$$
### Tempo richiesto ai segmenti di ACK per arrivare a destinazione ($d_{syn}$/$d_{ack}$)
$$d_{syn}=d_{ack}=d_p\ [s]$$
### Connessioni parallele e non, persistenti e non
$$d_{dati} = d_{tot}=d_e\ [s]$$
- Connessione ==non persistente e non parallela==:
Per ogni file:
$$d_{file}=d_{conn}+N\times(d_{dati}+d_{syn})$$
$$d_{tot}=\Sigma d_{file}$$
- Connessione ==persistente e non parallela==
Per ogni file:
$$d_{file}=N\times(d_{dati}+d_{syn})$$
$$d_{tot}=d_{conn}+\Sigma d_{file}$$
- Connessione ==non persistente e parallela==
Per i file da mandare in parallelo:
$$d_{file\ par}=d_{conn}+N\times(d_{dati\ par}+d_{syn})$$
Per i file che eventualmente avanzano:
$$d_{file}=d_{conn}+N\times(d_{dati}+d_{syn})$$
$$d_{tot}=d_{file\ par}+d_{file}$$
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
$$CW_{media}=0,75\times CW_{max}$$
### Velocità di trasferimento ($v_t$)
$$v_{max}=\frac{N_{max}\times L}{RTT}\ \Big[\frac{\textup{bit}}{s}\Big]$$
$$v_{media}=\frac{N_{tot}\times L}{RTT\times\textup{round}}\ \Big[\frac{\textup{bit}}{s}\Big]$$
$$v_{media}=\frac{CW_{media}\times L}{RTT}\ \Big[\frac{\textup{bit}}{s}\Big]$$

### Algoritmo di Dijkstra
![[Pasted image 20230518152317.png]]