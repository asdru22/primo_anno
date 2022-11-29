q_start = "####"
non_ripetere_domande = True
path = "C:/Users/Ale Uni/Documents/uni/primo_anno/DirittoInternet/preparazione_esame/domande.md"
domande_da_saltare = [2,5,100,101]

from random import randrange
file1 = open(path, 'r', encoding="utf-8")
Lines = file1.readlines()
domande = []
risposte = []
r = []

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



def stampa_domande(domande,risposte):
    r = randrange(len(risposte))
    print("======================================\n"+domande[r])
    inp = input()
    print("RISPOSTA:\n"+risposte[r].replace("  "," "))
    inp = input("premi \"e\" per uscire o qualsiasi altro tasto per continuare\n")
    if non_ripetere_domande:
        risposte.pop(r)
        domande.pop(r)

leggifile(Lines,domande,risposte,r,q_start)
salta_domande(domande,risposte)
inp = 'n'
while(inp!="e"): stampa_domande(domande,risposte)