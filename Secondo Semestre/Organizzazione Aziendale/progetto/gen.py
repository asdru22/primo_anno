import pandas as pd
import random
n = 75   # size of the square array
mat = [[0]*n for _ in range(n)]
f = open("in.txt","r")
c = 0
for line in f:
    line = line.replace("\n","")
    mat[0][c]= line
    mat[c][0]=line
    mat[random()*100%74][random()*100%74] = random()*10%2
    mat[c][c]= 1
    mat[20][c]=1
    c+=1
    
import openpyxl

# Create a new workbook
workbook = openpyxl.Workbook()

# Select the active worksheet
worksheet = workbook.active

# Write the matrix to the worksheet
for row in mat:
    worksheet.append(row)

# Save the workbook
workbook.save("matrix.xlsx")
