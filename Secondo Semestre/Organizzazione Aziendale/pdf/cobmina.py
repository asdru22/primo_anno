import os
from PyPDF2 import PdfMerger

path = "C:/Users/Ale/Documents/GitHub/primo_anno/Secondo Semestre/Organizzazione Aziendale/pdf"

# create a PdfMerger object
merger = PdfMerger()

# loop through all files in the path folder
for filename in os.listdir(path):
    # check if the file is a PDF
    if filename.endswith(".pdf"):
        # add the PDF to the merger
        merger.append(open(os.path.join(path, filename), "rb"))

# write the merged PDF to a new file
with open(os.path.join(path, "appuntato.pdf"), "wb") as output_file:
    merger.write(output_file)