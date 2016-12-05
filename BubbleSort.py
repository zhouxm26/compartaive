import time

def bubbleSort(alist):
    for passnum in range(len(alist)-1,0,-1):
        for i in range(passnum):
            if alist[i]>alist[i+1]:
                temp = alist[i]
                alist[i] = alist[i+1]
                alist[i+1] = temp
with open('input1.txt') as f:
    array = []
    for line in f: # read rest of lines
        for x in line.split():
            array.append(int(x))
startime = time.time()
bubbleSort(array)
endtime = time.time()
print(startime - endtime)

with open('input2.txt') as f:
    array = []
    for line in f: # read rest of lines
        for x in line.split():
            array.append(int(x))
startime = time.time()
bubbleSort(array)
endtime = time.time()
print(startime - endtime)

with open('input3.txt') as f:
    array = []
    for line in f: # read rest of lines
        for x in line.split():
            array.append(int(x))
startime = time.time()
bubbleSort(array)
endtime = time.time()
print(startime - endtime)

with open('input4.txt') as f:
    array = []
    for line in f: # read rest of lines
        for x in line.split():
            array.append(int(x))
startime = time.time()
bubbleSort(array)
endtime = time.time()
print(startime - endtime)

with open('input5.txt') as f:
    array = []
    for line in f: # read rest of lines
        for x in line.split():
            array.append(int(x))
startime = time.time()
bubbleSort(array)
endtime = time.time()
print(startime - endtime)