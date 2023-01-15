q_start = "####"
non_ripetere_domande = True
domande_da_saltare = [66,67,68,88,89,90,91,92,93,94,95,96,97,98,99]

from random import randrange
file1 = open("C:/Users/Ale/Documents/github/primo_anno/DirittoInternet/preparazione_esame/domande.md", 'r', encoding="utf-8")
Lines = file1.readlines()
domande = []
risposte = []
r = []
global ndomande

def leggifile(Lines,domande,risposte,r,q_start):
    for line in Lines:
        if q_start in line:
            risposte.append(''.join(r))
            domande.append(line.replace(q_start,""))
            r = []
        else: 
            r.append(line)
    risposte.pop(0)

def salta_domande(domande,risposte):
    c = 1
    for q in domande_da_saltare:
        risposte.pop(q-c)
        domande.pop(q-c)
        c+=1
    return len(domande)


def stampa_domande(domande,risposte,i,ndomande):
    r = randrange(len(risposte))
    print("["+str(i)+"/"+str(ndomande)+"]======================================\n"+domande[r])
    inp = input()
    print("RISPOSTA:\n"+risposte[r].replace("  "," "))
    inp = input("premi \"e\" per uscire o qualsiasi altro tasto per continuare\n")
    if non_ripetere_domande:
        risposte.pop(r)
        domande.pop(r)

leggifile(Lines,domande,risposte,r,q_start)
ndomande = salta_domande(domande,risposte) 
inp = 'n'
i = 0
while(inp!="e"):
    i=i+1
    stampa_domande(domande,risposte,i,ndomande)