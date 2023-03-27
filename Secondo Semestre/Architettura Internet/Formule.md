### Delay di propagazione ($d_p$)
$$d_p=\frac{\textup{distanza tra nodi}}{\textup{velocità di propagazione}}\ [\frac{m}{\frac{m}s}=s]$$
### Delay di trasmissione ($d_t$)
$$d_t=\frac{\textup{dimensione del pacchetto }}{\textup{banda di trasmissione}}\ [\frac{\textup{bit}}{\frac{\textup{bit}}s}=s]$$
### Delay di accodamento ($d_a$)
$$d_a=\textup{numero medio di pacchetti in coda}\cdot d_t\ [s]$$
### Delay end to end ($d_e$)
$$d_e=d_p+d_t+d_a+\textup{ritardo di elaborazione}\ [s]$$
Solitamente, $d_e=\frac{\textup{round trip time}}2$
### Banda ($R$)
### Troughput ($T$)
$$T_{max}=\textup{R}\ [s]$$
Nel caso di una rete con collegamenti multipli, si considera il collegamento con banda più bassa.
$$\bar{T}=\frac{\textup{dimensione pacchetto}}{t_{tot}}\ [\frac{\textup{bit}}{\textup s}]$$
### Tempo totale di trasmissione ($t_{tot}$)
Se il file è trasmesso come flusso continuo di pacchetti
$$t_{tot}=d_p+N\times d_t\ [s]$$
Se il file è trasmesso pacchetto per pacchetto
$$t_{tot}=N\times d_p+N\times d_t\ [s]$$
### Numero di pacchetti ($N$)
$$N=\frac{\textup{dimensione pacchetto}}{\textup{lunghezza pacchetto}}$$
### Bandwidth Delay Product ($BDP$)
$$BDP=d_p\times R\ [\textup{bit}]$$
### Perdita di pacchetti
$$N_{persi}=N\times P_{perdita}$$
Tempo totale impiegato per la trasmissione di un file supponendo che i pacchetti possano essere persi:
$$T_{perdita}=(N+N_{persi})\times(d_p+d_t)\ [s]$$