####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure17_14bMovieTextureWhirlpool.py
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

newModel=X3D(profile='Immersive',version='3.0',
  head=head(
    children=[
    meta(content='Figure17_14bMovieTextureWhirlpool.x3d',name='title'),
    meta(content='Figure 17.14b, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch17/17fig14b.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='28 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A swirling whirlpool created using a movie texture.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter17Textures/Figure17_14bMovieTextureWhirlpool.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure17_14bMovieTextureWhirlpool.x3d'),
    Viewpoint(description='MovieTexture whirlpool',orientation=(1,0,0,-0.758),position=(0,6,6)),
    Group(
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0,0.7,0))),
        geometry=Box(size=(10,0.01,10))),
      Shape(
        appearance=Appearance(
          texture=ImageTexture(url=["wellwall.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter17Textures/wellwall.jpg"])),
        geometry=Extrusion(beginCap=False,creaseAngle=1.57,crossSection=[(0.4,0),(0.4,-0.7),(-0.4,-0.7),(-0.4,0)],endCap=False,spine=[(2.00,0.0,0.00),(1.85,0.0,0.77),(1.41,0.0,1.41),(0.77,0.0,1.85),(0.00,0.0,2.00),(-0.77,0.0,1.85),(-1.41,0.0,1.41),(-1.85,0.0,0.77),(-2.00,0.0,0.00),(-1.85,0.0,-0.77),(-1.41,0.0,-1.41),(-0.77,0.0,-1.85),(0.00,0.0,-2.00),(0.77,0.0,-1.85),(1.41,0.0,-1.41),(1.85,0.0,-0.77),(2.00,0.0,0.00)])),
      Shape(
        appearance=Appearance(
          texture=MovieTexture(loop=True,url=["wrlpool.mpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/wrlpool.mpg"])),
        geometry=IndexedFaceSet(ccw=False,coordIndex=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16],
          coord=Coordinate(point=[(2.00,0.6,0.00),(1.85,0.6,0.67),(1.41,0.6,1.41),(0.67,0.6,1.85),(0.00,0.6,2.00),(-0.67,0.6,1.85),(-1.41,0.6,1.41),(-1.85,0.6,0.67),(-2.00,0.6,0.00),(-1.85,0.6,-0.67),(-1.41,0.6,-1.41),(-0.67,0.6,-1.85),(0.00,0.6,-2.00),(0.67,0.6,-1.85),(1.41,0.6,-1.41),(1.85,0.6,-0.67),(2.00,0.6,0.00)])))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure17_14bMovieTextureWhirlpool.py:')
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

print("python Figure17_14bMovieTextureWhirlpool.py load and self-test diagnostics complete.")
