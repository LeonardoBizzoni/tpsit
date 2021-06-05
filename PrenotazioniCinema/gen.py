import random

f = open("client.txt", "w")

for i in range(200):
    if(random.randint(0, 1) == 0):
        f.write("online,")
    else:
        f.write("fisica,")

    f.write(str(random.randint(0,3)) + ",")
    f.write(str(random.randint(1,10)) + ",")
    f.write(str(random.randint(1000,10000)) + "\n")

f.close()
