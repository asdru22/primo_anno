# regista-> filmografia-> 5 film
# 
# Regia, Anno di produzione,


import pandas as pd

class film():
    def __init__(self,regista,film,anno,attore1,attore2,attore3,attore4,scenografia,montaggio,produzione,musica,genere,sceneggiatura,premi):
        self.regista = regista
        self.film = film
        self.anno = anno
        self.attori = []
        self.attori.append(attore1)
        self.attori.append(attore2)
        self.attori.append(attore3)
        self.attori.append(attore4)
        self.scenografia = scenografia
        self.montaggio = montaggio
        self.produzione = produzione.split(',')
        self.musica = musica.split(',')
        self.genere = genere.split(',')
        self.sceneggiatura = sceneggiatura.split(',')
        self.premi = str(premi).split(',')
        
    def toString(self):
        return f'Regista: {self.regista}, Film: {self.film}, Anno: {self.anno}, Attori: {self.attori}, Scenografia: {self.scenografia}, Montaggio: {self.montaggio}, Produzione: {self.produzione}, Musica: {self.musica}, Genere: {self.genere}, Sceneggiatura: {self.sceneggiatura}, Premi: {self.premi}\n'

# Read the Excel file/
df = pd.read_excel('C:/Users/Ale/Documents/GitHub/primo_anno/Secondo Semestre/Organizzazione Aziendale/progetto/dati.xlsx', sheet_name='Foglio1')
matrix = df.values
films = []
for line in matrix:
    films.append(film(line[0],line[1],line[2],line[3],line[4],line[5],line[6],line[7],line[8],line[9],line[10],line[11],line[12],line[13]))
    
for f in films:
    print(f.toString())
