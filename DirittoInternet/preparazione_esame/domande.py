### impostazioni
questions = 34 ### numero di domande
q_start = "#### " ### ogni linea che inizia con questo è domanda, il resto risposte
path = 'preparazione_esame/domande.md'

### setup roba
from random import randrange
file1 = open(path, 'r', encoding="utf-8")
Lines = file1.readlines()
filter = "####"
domande = []
risposte = []
r = []

### codice
for line in Lines:
    if filter in line:
        risposte.append(''.join(r))
        domande.append(line.replace(q_start,""))
        r = []
    else: 
        r.append(line)
risposte.pop(0)
inp = 'n'
while(inp!="e"):
    r = randrange(questions)
    print("======================================\n"+domande[r])
    inp = input()
    print("RISPOSTA:\n"+risposte[r].replace("  "," "))
    inp = input("premi \"e\" per uscire o qualsiasi altro tasto per continuare\n")
