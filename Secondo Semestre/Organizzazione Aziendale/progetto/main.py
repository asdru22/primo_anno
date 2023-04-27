# regista-> filmografia-> 5 film
# 
# Regia, Anno di produzione,


import pandas as pd

# Read the Excel file/
df = pd.read_excel('C:/Users/Ale/Documents/GitHub/primo_anno/Secondo Semestre/Organizzazione Aziendale/progetto/dati.xlsx', sheet_name='Foglio1')
matrix = df.values
print(matrix)

for line in matrix:
    print("")
    
    
    
class film():
    def __init__(self,regista,film,anno,attore1,attore2,attore3,attore4,scenografia,montaggio,produzione,musica,genere,sceneggiatura,premi)