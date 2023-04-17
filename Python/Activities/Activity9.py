listnum1 = [1,2,3,4,5]
listnum2 = [6,7,8,9,10]
listnum3 = []

for i in listnum2:
    if(i % 2 == 0):
        listnum3.append(i)
print(listnum3)

for j in listnum1:
    if(j % 2 != 0):
        listnum3.append(j)
print(listnum3)