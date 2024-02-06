####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python aTorch3.py
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

newModel=X3D(profile='Immersive',version='3.3',
  head=head(
    children=[
    meta(content='aTorch3.x3d',name='title'),
    meta(content='Torch with non-animated flames (low detail) This file creates a torch *without* animated flames, but for use in an LOD with other torches that do have animated flames. Instead of animated flames, this torch uses a single torch texture.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='aTorch.x3d',name='reference'),
    meta(content='originals/aTorch3.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0500.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/aTorch3.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Torch with animated flames (low detail)'),
    Transform(scale=(0.5,0.5,0.5),translation=(0.0,0.0,0.2),
      children=[
      Shape(
        appearance=Appearance(DEF='Gray',
          material=Material(diffuseColor=(0.4,0.4,0.4))),
        geometry=IndexedFaceSet(coordIndex=[0,1,2],
          coord=Coordinate(point=[(-0.15,0.0,0.0),(0.0,-1.5,0.0),(0.15,0.0,0.0)]))),
      Shape(DEF='Ring',
        appearance=Appearance(USE='Gray'),
        geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1,4,5,6,7,-1],
          coord=Coordinate(point=[(-0.4,-0.05,0.1),(0.4,-0.05,0.1),(0.4,0.05,0.1),(-0.4,0.05,0.1),(-0.4,0.15,0.1),(0.4,0.15,0.1),(0.4,0.25,0.1),(-0.4,0.25,0.1)]))),
      Billboard(
        children=[
        Shape(
          appearance=Appearance(
            texture=ImageTexture(url=["flames1.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/flames1.png"])),
          geometry=IndexedFaceSet(coordIndex=[0,1,2,3],solid=False,texCoordIndex=[0,1,2,3],
            texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
            coord=Coordinate(point=[(-0.5,0.0,0.0),(0.5,0.0,0.0),(0.5,1.8,0.0),(-0.5,1.8,0.0)])))])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for aTorch3.py:')
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

print("python aTorch3.py load and self-test diagnostics complete.")
