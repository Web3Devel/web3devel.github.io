####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Torch3.py
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

newModel=X3D(profile='Interchange',version='3.3',
  head=head(
    children=[
    meta(content='Torch3.x3d',name='title'),
    meta(content='Medieval torch with low-resolution detail.',name='description'),
    meta(content='David R. Nadeau, John L. Moreland, Michael M. Heck',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Torches.x3d',name='reference'),
    meta(content='Torches3.x3d',name='reference'),
    meta(content='originals/torch3.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0389.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0397.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Torch3.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Torch3.x3d'),
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
      Shape(DEF='Flames',
        geometry=IndexedFaceSet(coordIndex=[0,1,2],
          coord=Coordinate(point=[(0.18,0.0,0.05),(0.0,1.2,0.05),(-0.18,0.0,0.05)]),
          color=Color(color=[(1.0,0.0,0.0),(0.9,0.5,0.0),(1.0,0.0,0.0)])))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Torch3.py:')
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

print("python Torch3.py load and self-test diagnostics complete.")
