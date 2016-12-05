import random

fo = open("input1.txt", "w")
for i in range(10):
    x = random.randint(0, 100)
    fo.write("%d " % x)
fo.close()

fo = open("input2.txt", "w")
for i in range(100):
    x = random.randint(0, 1000)
    fo.write("%d " % x)
fo.close()

fo = open("input3.txt", "w")
for i in range(1000):
    x = random.randint(0, 10000)
    fo.write("%d " % x)
fo.close()

fo = open("input4.txt", "w")
for i in range(10000):
    x = random.randint(0, 100000)
    fo.write("%d " % x)
fo.close()

fo = open("input5.txt", "w")
for i in range(100000):
    x = random.randint(0, 1000000)
    fo.write("%d " % x)
fo.close()