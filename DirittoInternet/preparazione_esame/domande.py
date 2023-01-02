q_start = "####"
non_ripetere_domande = True
domande_da_saltare = [100,101]

from random import randrange
file1 = open("C:/Users/Ale/Documents/github/primo_anno/DirittoInternet/preparazione_esame/domande.md", 'r', encoding="utf-8")
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

"""
Dubbi:
Differenza tra licenza freeware e open source
Quando può considerarsi concluso un contratto stipulato via Internet?
I B2B sono regolamentati dal C.C, art. 70/2003, Regolamento roma 3?
Differenza conseguenze giuridiche tra Causa mista e collegamento negoziale
"""