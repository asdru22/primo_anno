start_page = int(input("Da pagina "))  # Page numbering starts at 0 in PyPDF2
end_page  = int(input("a pagina ")) 
import PyPDF2

# Open the input PDF file
input_pdf = PyPDF2.PdfReader(open("C:/Users/Ale/Documents/GitHub/primo_anno/Secondo Semestre/Algebra/pdf_prof.pdf", "rb"))

# Create a new PDF file for the extracted pages
output_pdf = PyPDF2.PdfWriter()

# Set the range of pages to extract (in this case, pages 3-5)

for page_num in range(start_page-1, end_page):
    output_pdf.add_page(input_pdf.pages[page_num])

# Save the extracted pages to a new PDF file
with open("C:/Users/Ale/Documents/GitHub/primo_anno/Secondo Semestre/Algebra/pdf_prof/tagliato.pdf", "wb") as out_file:
    output_pdf.write(out_file)
