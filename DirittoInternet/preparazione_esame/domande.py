q = "####"
non_ripetere_domande = True
###
from random import randrange
file1 = open('preparazione_esame/domande.md', 'r', encoding="utf-8")
Lines = file1.readlines()
domande = []
risposte = []
r = []

for line in Lines:
    if q in line:
        risposte.append(''.join(r))
        domande.append(line.replace("#### ",""))
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