### Delay di propagazione ($d_p$)
$$d_p=\frac{\textup{distanza tra nodi}}{\textup{velocità di propagazione}}=\frac{m}{\frac{m}s}=s$$
### Delay di trasmissione ($d_t$)
$$d_t=\frac{\textup{dimensione del pacchetto }}{\textup{banda di trasmissione}}=\frac{\textup{bit}}{\frac{\textup{bit}}s}=s$$
### Delay di accodamento ($d_a$)
$$d_a=\textup{numero medio di pacchetti in coda}\cdot d_t=s$$
### Delay end to end ($d_e$)
$$d_e=d_p+d_t+d_a+\textup{ritardo di elaborazione}=s$$
Solitamente, $d_e=\frac{\textup{round trip time}}2$
