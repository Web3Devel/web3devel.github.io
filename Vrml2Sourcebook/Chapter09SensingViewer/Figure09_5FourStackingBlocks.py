####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure09_5FourStackingBlocks.py
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
    meta(content='Figure09_5FourStackingBlocks.x3d',name='title'),
    meta(content='Figure 9.5, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch09/09fig05.htm',name='reference'),
    meta(content='Don Brutzman',name='transcriber'),
    meta(content='9 August 2000',name='created'),
    meta(content='4 September 2023',name='modified'),
    meta(content='Four stacking blocks, select and drag to see each of them.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter09SensingViewer/Figure09_5FourStackingBlocks.x3d',name='identifier'),
    meta(content='X3D-Edit 4.0, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure09_5FourStackingBlocks.x3d'),
    Viewpoint(description='Hello Cubes.',position=(0,0,15)),
    #  Dragging Orderly Cubes. Superfluous Group nodes removed. 
    Transform(DEF='BLOCK_1_TRANSFORM',
      children=[
      Shape(
        geometry=Box(),
        appearance=Appearance(
          material=Material(diffuseColor=(.5,.5,.5),emissiveColor=(.5,0,0)))),
      PlaneSensor(DEF='BLOCK_1_SENSOR',description='Click and drag to move box',maxPosition=(3,3),minPosition=(-3,-3))]),
    Transform(DEF='BLOCK_2_TRANSFORM',
      children=[
      Shape(
        geometry=Box(),
        appearance=Appearance(
          material=Material(diffuseColor=(.5,.5,.5),emissiveColor=(0,.5,0)))),
      PlaneSensor(DEF='BLOCK_2_SENSOR',description='Click and drag to move box',maxPosition=(3,3),minPosition=(-3,-3),offset=(2.5,0,0))]),
    Transform(DEF='BLOCK_3_TRANSFORM',
      children=[
      Shape(
        geometry=Box(),
        appearance=Appearance(
          material=Material(diffuseColor=(.5,.5,.5),emissiveColor=(0,0,.5)))),
      PlaneSensor(DEF='BLOCK_3_SENSOR',description='Click and drag to move box',maxPosition=(3,3),minPosition=(-3,-3),offset=(-1.5,-2,0))]),
    Transform(DEF='BLOCK_4_TRANSFORM',
      children=[
      Shape(
        geometry=Box(),
        appearance=Appearance(
          material=Material(diffuseColor=(.5,.5,.5),emissiveColor=(.5,.5,0)))),
      PlaneSensor(DEF='BLOCK_4_SENSOR',description='Click and drag to move box',maxPosition=(3,3),minPosition=(-3,-3),offset=(.75,4,0))]),
    #  Note that we are connecting a translation (SFVec3F) output to a translation (SFVec3F) input in these ROUTEs. 
    ROUTE(fromField='translation_changed',fromNode='BLOCK_1_SENSOR',toField='set_translation',toNode='BLOCK_1_TRANSFORM'),
    ROUTE(fromField='translation_changed',fromNode='BLOCK_2_SENSOR',toField='set_translation',toNode='BLOCK_2_TRANSFORM'),
    ROUTE(fromField='translation_changed',fromNode='BLOCK_3_SENSOR',toField='set_translation',toNode='BLOCK_3_TRANSFORM'),
    ROUTE(fromField='translation_changed',fromNode='BLOCK_4_SENSOR',toField='set_translation',toNode='BLOCK_4_TRANSFORM')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure09_5FourStackingBlocks.py:')
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

print("python Figure09_5FourStackingBlocks.py load and self-test diagnostics complete.")
