class A:
    def __init__(self,x,z):
        self.x=x
        self.z=z
    def incrementaXZ(self):
        self.x=self.x+1
        self.z=self.z+1
    def incrementaZ(self):
        self.z=self.z+1

class B:
    def __init__(self,y,z):
        self.y=y
        self.z=z
    def incrementaYZ(self):
        self.y=self.y+1
        self.z=self.z+1
    def incrementaZ(self):
        self.z=self.z+1
class D(A,B):
    def __init__(self,x,y,z):
        A.__init__(self,x,z)
        B.__init__(self,y,z)
    def incrementaXYZ(self):
        self.x=self.x+1
        self.y=self.y+1
        self.z=self.z+1
        
d=D(5,3,2)
print("(",d.x,",",d.y,",",d.z,")")
d.incrementaXYZ()
print("incrementaXYZ: ")
print("(",d.x,",",d.y,",",d.z,")
