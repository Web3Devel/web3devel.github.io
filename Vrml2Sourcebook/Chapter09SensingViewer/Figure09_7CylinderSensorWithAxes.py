####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure09_7CylinderSensorWithAxes.py
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
    meta(content='Figure09_7CylinderSensorWithAxes.x3d',name='title'),
    meta(content='Figure 9.7, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch09/09fig07.htm',name='reference'),
    meta(content='Don Brutzman',name='transcriber'),
    meta(content='12 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Two shapes that rotate about an axis when the viewer drags them, with coordinate axes superimposed to show X3D/VRML directions.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter09SensingViewer/Figure09_7CylinderSensorWithAxes.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    #  Click and drag to rotate shapes. Superfluous Group nodes removed. 
    #  First rotate to reorient the first CylinderSensor 
    children=[
    WorldInfo(title='Figure09_7CylinderSensorWithAxes.x3d'),
    Transform(rotation=(1,0,0,1.57),translation=(-2,0,0),
      children=[
      CylinderSensor(DEF='FIRST_CYLINDERSENSOR',description='Click and drag to rotate',maxAngle=1.57,minAngle=-0.78),
      Transform(DEF='FIRST_TRANSFORM',
        #  Note that we are connecting a rotation output to a rotation input in these ROUTEs. 
        children=[
        ROUTE(fromField='rotation_changed',fromNode='FIRST_CYLINDERSENSOR',toField='set_rotation',toNode='FIRST_TRANSFORM'),
        #  Keep transparent user-interface geometry in this rotated CylinderSensor coordinate frame 
        Transform(DEF='TRANSPARENT_CYLINDER_TRANSFORM',
          children=[
          Shape(
            geometry=Cylinder(height=.5),
            appearance=Appearance(
              material=Material(diffuseColor=(.7,.7,.7),transparency=.5)))]),
        #  Now restore original Y=up coordinate frame prior to drawing actual geometry 
        Transform(rotation=(1,0,0,-1.57),
          children=[
          Shape(
            geometry=Box(size=(1,3,1)),
            appearance=Appearance(DEF='FIRST_APPEARANCE',
              material=Material(diffuseColor=(.9,.9,.1),emissiveColor=(.2,.2,.05))))])])]),
    #  Note this second example uses a simpler pattern: since we are not rotating the axis of the CylinderSensor away from the vertical, we do not need to change that rotation back again for the target geometry. 
    Transform(DEF='SECOND_TRANSFORM',translation=(2,0,0),
      children=[
      CylinderSensor(DEF='SECOND_CYLINDERSENSOR',description='Click and drag to rotate'),
      ROUTE(fromField='rotation_changed',fromNode='SECOND_CYLINDERSENSOR',toField='set_rotation',toNode='SECOND_TRANSFORM'),
      #  Keep transparent user-interface geometry in this rotated CylinderSensor coordinate frame 
      Transform(USE='TRANSPARENT_CYLINDER_TRANSFORM'),
      #  Rotate actual geometry 
      Transform(rotation=(1,0,0,0.52),
        children=[
        Shape(
          geometry=Cone(),
          appearance=Appearance(USE='FIRST_APPEARANCE'))])]),
    #  Adding this Inline reference to another scene superimposes X3D/VRML coordinate system axes. 
    Transform(scale=(4,4,4),
      children=[
      Inline(DEF='CoordinateAxes',url=["../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure09_7CylinderSensorWithAxes.py:')
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

print("python Figure09_7CylinderSensorWithAxes.py load and self-test diagnostics complete.")
