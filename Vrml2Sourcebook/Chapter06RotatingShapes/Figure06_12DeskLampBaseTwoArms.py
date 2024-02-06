####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure06_12DeskLampBaseTwoArms.py
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
    meta(content='Figure06_12DeskLampBaseTwoArms.x3d',name='title'),
    meta(content='Figure 6.12, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch06/06fig12.htm',name='reference'),
    meta(content='Don Brutzman',name='transcriber'),
    meta(content='8 October 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='The first and second arms of the desk lamp, each rotated using a center of rotation at the lower end of each arm. See Figures 6.11 and 9.9 for comparison.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter06RotatingShapes/Figure06_12DeskLampBaseTwoArms.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure06_12DeskLampBaseTwoArms.x3d'),
    Viewpoint(description='View lamp base',orientation=(1,0,0,-0.2),position=(0,0.25,1)),
    Group(
      children=[
      Shape(
        geometry=Cylinder(height=0.01,radius=0.1),
        appearance=Appearance(DEF='White',
          material=Material(diffuseColor=(0.9,0.9,0.9)))),
      Transform(center=(0,-0.15,0),rotation=(1,0,0,-0.7),translation=(0,0.15,0),
        children=[
        Shape(DEF='LampArm',
          geometry=Cylinder(height=0.3,radius=0.01),
          appearance=Appearance(USE='White')),
        Transform(center=(0,-0.15,0),rotation=(1,0,0,1.9),translation=(0,0.3,0),
          children=[
          Shape(USE='LampArm')])])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure06_12DeskLampBaseTwoArms.py:')
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

print("python Figure06_12DeskLampBaseTwoArms.py load and self-test diagnostics complete.")
