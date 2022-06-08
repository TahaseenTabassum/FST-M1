import pytest
import math
a=20
b=5
def testsum():
   num1 = a+b
   assert num1==25

def testdiff():
    num2 = a-b
    assert num2==15

def testproduct():
   num3 = a*b
   assert num3==100

def testquotient():
   num4 = a/b
   assert num4==4