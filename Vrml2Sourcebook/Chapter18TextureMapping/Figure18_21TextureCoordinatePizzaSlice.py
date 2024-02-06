####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure18_21TextureCoordinatePizzaSlice.py
#
# Python package x3d.py package is available on PyPI for import.
#   This approach simplifies Python X3D deployment and use.
#   https://pypi.org/project/x3d
#
# Installation:
#       pip install x3d
# or
#       python -m pip install x3d
#
# Developer options for loading x3d package in other Python programs:
#
#    from x3d import *  # preferred approach, terser source that avoids x3d.* class prefixes
#
# or
#    import x3d         # traditional way to subclass x3d package, all classes require x3d.* prefix,
#                       # but python source is very verbose, for example x3d.Material x3d.Shape etc.
#                       # X3dToPython.xslt stylesheet insertPackagePrefix=true supports this option.
#
####################################################################################################

from x3d import *

newModel=X3D(profile='Interchange',version='3.0',
  head=head(
    children=[
    meta(content='Figure18_21TextureCoordinatePizzaSlice.x3d',name='title'),
    meta(content='Figure 18.21, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch18/18fig21.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='4 September 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A pizza and slice. Also see Figure 18.20b and Figure 18.21 for comparison.',name='description'),
    meta(content='Figure18_20bTextureCoordinatePizzaSlice.x3d',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter18TextureMapping/Figure18_21TextureCoordinatePizzaSlice.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure18_21TextureCoordinatePizzaSlice.x3d'),
    Viewpoint(description='Hey pepperoni',orientation=(1,0,0,-0.758),position=(0,2,2)),
    Shape(
      appearance=Appearance(
        texture=ImageTexture(url=["pizza.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter18TextureMapping/pizza.jpg"])),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3,4,5,-1,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35],solid=False,texCoordIndex=[0,28,29,30,31,32,-1,0,32,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28],
        coord=Coordinate(point=[(0.50,0,0.50),(0.88,0,1.42),(1.06,0,1.33),(1.21,0,1.21),(1.33,0,1.06),(1.42,0,0.88),(0.00,0,0.00),(0.92,0,0.38),(0.98,0,0.20),(1.00,0,0.00),(0.98,0,-0.20),(0.92,0,-0.38),(0.83,0,-0.56),(0.71,0,-0.71),(0.56,0,-0.83),(0.38,0,-0.92),(0.20,0,-0.98),(0.00,0,-1.00),(-0.20,0,-0.98),(-0.38,0,-0.92),(-0.56,0,-0.83),(-0.71,0,-0.71),(-0.83,0,-0.56),(-0.92,0,-0.38),(-0.98,0,-0.20),(-1.00,0,0.00),(-0.98,0,0.20),(-0.92,0,0.38),(-0.83,0,0.56),(-0.71,0,0.71),(-0.56,0,0.83),(-0.38,0,0.92),(-0.20,0,0.98),(0.00,0,1.00),(0.20,0,0.98),(0.38,0,0.92)]),
        texCoord=TextureCoordinate(point=[(0.50,0.50),(0.96,0.41),(0.97,0.50),(0.96,0.59),(0.93,0.68),(0.89,0.76),(0.83,0.83),(0.76,0.89),(0.68,0.93),(0.59,0.96),(0.50,0.97),(0.41,0.96),(0.32,0.93),(0.24,0.89),(0.17,0.83),(0.11,0.76),(0.07,0.68),(0.04,0.59),(0.03,0.50),(0.04,0.41),(0.07,0.32),(0.11,0.24),(0.17,0.17),(0.24,0.11),(0.32,0.07),(0.41,0.04),(0.50,0.03),(0.59,0.04),(0.68,0.07),(0.76,0.11),(0.83,0.17),(0.89,0.24),(0.93,0.32)])))])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure18_21TextureCoordinatePizzaSlice.py:')
if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel)) # display meta info, hint, warning, error, TODO values in this model
# print('check newModel.XML() serialization...')
newModelXML= newModel.XML() # test export method XML() for exceptions during export
newModel.XMLvalidate()
# print(newModelXML) # diagnostic

try:
#   print('check newModel.VRML() serialization...')
    newModelVRML=newModel.VRML() # test export method VRML() for exceptions during export
    # print(prependLineNumbers(newModelVRML)) # debug
    print("Python-to-VRML export of VRML output successful", flush=True)
except Exception as err: # usually BaseException
    # https://stackoverflow.com/questions/18176602/how-to-get-the-name-of-an-exception-that-was-caught-in-python
    print("*** Python-to-VRML export of VRML output failed:", type(err).__name__, err)
    if newModelVRML: # may have failed to generate
        print(prependLineNumbers(newModelVRML, err.lineno))

try:
#   print('check newModel.JSON() serialization...')
    newModelJSON=newModel.JSON() # test export method JSON() for exceptions during export
#   print(prependLineNumbers(newModelJSON)) # debug
    print("Python-to-JSON export of JSON output successful (under development)")
except Exception as err: # usually SyntaxError
    print("*** Python-to-JSON export of JSON output failed:", type(err).__name__, err)
    if newModelJSON: # may have failed to generate
        print(prependLineNumbers(newModelJSON,err.lineno))

print("python Figure18_21TextureCoordinatePizzaSlice.py load and self-test diagnostics complete.")
