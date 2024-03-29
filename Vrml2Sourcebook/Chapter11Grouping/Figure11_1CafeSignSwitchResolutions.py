####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure11_1CafeSignSwitchResolutions.py
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
    meta(content='Figure11_1CafeSignSwitchResolutions.x3d',name='title'),
    meta(content='Figure 11.1, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch11/11fig01a.htm',name='reference'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch11/11fig01b.htm',name='reference'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch11/11fig01c.htm',name='reference'),
    meta(content='Don Brutzman',name='transcriber'),
    meta(content='16 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Three versions of a cafe sign within a Switch node, selected by the whichChoice field.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter11Grouping/Figure11_1CafeSignSwitchResolutions.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure11_1CafeSignSwitchResolutions.x3d'),
    Viewpoint(description='Cafe sign',position=(0,0,8)),
    #  Modify the whichChoice value in this Switch to 0, 1 or 2 to see the various versions of the sign. Select whichChoice= -1 to show nothing. 
    Switch(whichChoice=2,
      children=[
      Group(DEF='Child0',
        children=[
        Shape(DEF='CAFE_TEXT_SHAPE',
          geometry=Text(string=["Cafe"],
            fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"])),
          appearance=Appearance(DEF='GLOW_WHITE',
            material=Material(diffuseColor=(0,0,0),emissiveColor=(1,1,1)))),
        Transform(DEF='BLUE_DISK',rotation=(1,0,0,-1.57),translation=(0,0.3,-0.1),
          children=[
          Shape(
            geometry=Cylinder(height=0.1,radius=1.3),
            appearance=Appearance(
              material=Material(DEF='BALL_COLOR_2',diffuseColor=(0,0.3,0.8))))])]),
      Group(DEF='Child1',
        children=[
        Shape(USE='CAFE_TEXT_SHAPE'),
        Transform(USE='BLUE_DISK'),
        Transform(DEF='WHITE_DISK',rotation=(1,0,0,-1.57),translation=(0,0.3,-0.1),
          children=[
          Shape(
            geometry=Cylinder(height=0.08,radius=1.4),
            appearance=Appearance(USE='GLOW_WHITE'))])]),
      Group(DEF='Child2',
        children=[
        Shape(USE='CAFE_TEXT_SHAPE'),
        Transform(USE='BLUE_DISK'),
        Transform(USE='WHITE_DISK'),
        Transform(DEF='RED_AND_WHITE_BOXES',translation=(0,0.3,-0.1),
          children=[
          Shape(
            geometry=Box(size=(4,1.2,0.06)),
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0,0)))),
          Shape(
            geometry=Box(size=(4.2,1.4,0.04)),
            appearance=Appearance(USE='GLOW_WHITE'))])])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure11_1CafeSignSwitchResolutions.py:')
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

print("python Figure11_1CafeSignSwitchResolutions.py load and self-test diagnostics complete.")
