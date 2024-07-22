# 4 -> Write a Python program to convert pressure in kilopascals to pounds per square inch, a millimeter of mercury (mmHg) and atmosphere pressure

"""
The conversions are:
- 1 kilopascal (kPa) = 0.145038 pounds per square inch (psi)
- 1 kilopascal (kPa) = 7.50062 millimeters of mercury (mmHg)
- 1 kilopascal (kPa) = 0.00986923 atmospheres (atm)

"""

def convert_pressure(kpa):
    psi = kpa * 0.145038
    mmHg = kpa * 7.50062
    atm = kpa * 0.00986923
    return psi, mmHg, atm


kpa = float(input("Enter Pressure in kilopascals. :"))

psi, mmHg, atm = convert_pressure(kpa)
print(f"{kpa} kPa is equivalent to:")
print(f"{psi:} psi")
print(f"{mmHg:} mmHg")
print(f"{atm:} atm")
