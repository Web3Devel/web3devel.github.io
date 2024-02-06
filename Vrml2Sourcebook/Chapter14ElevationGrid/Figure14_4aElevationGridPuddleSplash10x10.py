####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure14_4aElevationGridPuddleSplash10x10.py
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

newModel=X3D(profile='Interactive',version='3.0',
  head=head(
    children=[
    meta(content='Figure14_4aElevationGridPuddleSplash10x10.x3d',name='title'),
    meta(content='Figure 14.4a, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch14/14fig04a.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='19 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A puddle splash using a 10x10 elevation grid. Compare with Figure 14.4b.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter14ElevationGrid/Figure14_4aElevationGridPuddleSplash10x10.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure14_4aElevationGridPuddleSplash10x10.x3d'),
    Viewpoint(description='Puddle splash',orientation=(1,0,0,-0.8),position=(0.5,1.5,2)),
    Shape(
      appearance=Appearance(
        material=Material(diffuseColor=(0,0.6,1))),
      geometry=ElevationGrid(creaseAngle=3.14159,height=[0.08,0.03,-0.05,-0.08,-0.07,-0.07,-0.07,-0.08,-0.05,0.03,0.03,-0.06,-0.07,-0.01,0.04,0.05,0.04,-0.01,-0.07,-0.06,-0.05,-0.07,0.02,0.08,0.06,0.05,0.06,0.08,0.02,-0.07,-0.08,-0.01,0.08,0.02,-0.05,-0.07,-0.05,0.02,0.08,-0.01,-0.07,0.04,0.06,-0.05,-0.06,-0.02,-0.06,-0.05,0.06,0.04,-0.07,0.05,0.05,-0.07,-0.02,0.08,-0.02,-0.07,0.05,0.05,-0.07,0.04,0.06,-0.05,-0.06,-0.02,-0.06,-0.05,0.06,0.04,-0.08,-0.01,0.08,0.02,-0.05,-0.07,-0.05,0.02,0.08,-0.01,-0.05,-0.07,0.02,0.08,0.06,0.05,0.06,0.08,0.02,-0.07,0.03,-0.06,-0.07,-0.01,0.04,0.05,0.04,-0.01,-0.07,-0.06],solid=False,xDimension=10,xSpacing=0.10,zDimension=10,zSpacing=0.10))])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure14_4aElevationGridPuddleSplash10x10.py:')
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

print("python Figure14_4aElevationGridPuddleSplash10x10.py load and self-test diagnostics complete.")
