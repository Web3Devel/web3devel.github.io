####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure25_02TorchMediumDetail.py
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
    meta(content='Figure25_02TorchMediumDetail.x3d',name='title'),
    meta(content='Figure 25.2, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch25/25fig02.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='3 October 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A medium-detail torch.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_02TorchMediumDetail.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure25_02TorchMediumDetail.x3d'),
    Viewpoint(description='Torch (medium detail)',position=(0,0,2)),
    Transform(scale=(0.5,0.5,0.5),translation=(0,0,0.2),
      children=[
      Transform(rotation=(1,0,0,3.14),translation=(0,-0.75,0),
        children=[
        Shape(
          geometry=Cone(bottomRadius=0.15,height=1.5),
          appearance=Appearance(DEF='Gray',
            material=Material(diffuseColor=(0.4,0.4,0.4),specularColor=(0.7,0.7,0.7))))]),
      Shape(DEF='Ring',
        geometry=Cylinder(bottom=False,height=0.1,radius=0.4,top=False),
        appearance=Appearance(USE='Gray')),
      Transform(translation=(0,0.2,0),
        children=[
        Shape(USE='Ring')]),
      Transform(translation=(0,-0.35,0),
        children=[
        Shape(
          geometry=Cylinder(height=0.15,radius=0.20),
          appearance=Appearance(USE='Gray')),
        Transform(translation=(0,0,-0.2),
          children=[
          Shape(
            geometry=Box(size=(0.45,0.25,0.39)),
            appearance=Appearance(USE='Gray'))])]),
      Shape(DEF='Flames',
        #  No appearance, use emissive shading 
        geometry=IndexedFaceSet(coordIndex=[0,1,2,-1,3,4,5,-1,6,7,8,-1],
          coord=Coordinate(point=[(0.25,0.0,0.00),(0.15,1.0,0.10),(0.05,0.0,0.15),(0.18,0.0,0.05),(0.00,1.2,0.05),(-0.10,0.0,0.05),(-0.00,0.0,0.15),(-0.13,0.8,0.10),(-0.25,0.0,0.00)]),
          color=Color(color=[(1.0,0.0,0.0),(0.9,0.5,0),(1.0,0.0,0.0),(0.9,0.3,0),(1.0,1.0,0.0),(0.9,0.3,0),(0.7,0.1,0.2),(0.9,0.8,0),(1.0,0.0,0.0)])))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure25_02TorchMediumDetail.py:')
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

print("python Figure25_02TorchMediumDetail.py load and self-test diagnostics complete.")