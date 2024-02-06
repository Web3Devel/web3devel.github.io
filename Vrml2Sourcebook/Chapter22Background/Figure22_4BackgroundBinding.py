####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure22_4BackgroundBinding.py
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
    meta(content='Figure22_4BackgroundBinding.x3d',name='title'),
    meta(content='Figure 22.4, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch22/22fig04.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='22 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Backgrounds bound and unbound by touching a red cube or a blue sphere.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter22Background/Figure22_4BackgroundBinding.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    #  Note that navigation mode doesn't matter much here, since you cannot approach the backround, it always stays at maximum (horizon) distance 
    #  At least EXAMINE mode lets you easily look up/down/around. 
    children=[
    WorldInfo(title='Figure22_4BackgroundBinding.x3d'),
    Group(
      children=[
      Background(groundAngle=[1.309,1.570796],groundColor=[(0.1,0.1,0),(0.4,0.25,0.2),(0.6,0.6,0.6)],skyAngle=[1.309,1.571],skyColor=[(0,0.2,0.7),(0,0.5,1),(1,1,1)]),
      Background(DEF='AlternateBackground1',groundAngle=[1.309,1.570796],groundColor=[(0.1,0.1,0),(0.5,0.25,0.2),(0.6,0.6,0.2)],skyAngle=[1.309,1.571],skyColor=[(1,0,0),(1,0.4,0),(1,1,0)]),
      Background(DEF='AlternateBackground2',groundAngle=[1.309,1.570796],groundColor=[(0,0,0.1),(0,0.1,0.3),(0.3,0.3,0.6)],skyAngle=[1.309,1.571],skyColor=[(1,0,0.8),(0.5,0,0.8),(0,0,0.8)])]),
    #  Shapes to act as buttons 
    Transform(translation=(2,0,0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1,0,0))),
        geometry=Box(),),
      TouchSensor(DEF='TouchBox',description='Alternate reddish-orange background')]),
    Transform(translation=(-2,0,0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0,0,0.8))),
        geometry=Sphere(),),
      TouchSensor(DEF='TouchSphere',description='Alternate blueish-purple background')]),
    ROUTE(fromField='isActive',fromNode='TouchBox',toField='set_bind',toNode='AlternateBackground1'),
    ROUTE(fromField='isActive',fromNode='TouchSphere',toField='set_bind',toNode='AlternateBackground2')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure22_4BackgroundBinding.py:')
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

print("python Figure22_4BackgroundBinding.py load and self-test diagnostics complete.")