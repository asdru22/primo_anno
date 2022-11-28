q_start = "####"
non_ripetere_domande = True
path = "C:/Users/Ale Uni/Documents/uni/primo_anno/DirittoInternet/preparazione_esame/domande.md"

from random import randrange
file1 = open(path, 'r', encoding="utf-8")
Lines = file1.readlines()
domande = []
risposte = []
r = []

### codice
for line in Lines:
    if q_start in line:
        risposte.append(''.join(r))
        domande.append(line.replace(q_start,""))
        r = []
    else: 
        r.append(line)
risposte.pop(0)
inp = 'n'
while(inp!="e"):
    r = randrange(len(risposte))
    print("======================================\n"+domande[r])
    inp = input()
    print("RISPOSTA:\n"+risposte[r].replace("  "," "))
    inp = input("premi \"e\" per uscire o qualsiasi altro tasto per continuare\n")
    if non_ripetere_domande:
        risposte.pop(r)
        domande.pop(r)