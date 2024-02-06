####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure28_1AnchorViewpointsDungeon.py
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
    meta(content='Figure28_1AnchorViewpointsDungeon.x3d',name='title'),
    meta(content='Figure 28.1, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch28/28fig02.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='30 October 2001',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A dungeon destination world. Click either anchored Cone to switch viewpoints. Anchor viewpoint DEF names are indicated by the url, similar to HTML bookmarks on a page.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter28Anchor/Figure28_1AnchorViewpointsDungeon.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure28_1AnchorViewpointsDungeon.x3d'),
    Viewpoint(description='Forward view',position=(0,1.6,5)),
    Viewpoint(DEF='RIGHT_CORNER_DEF_NAME',description='Right corner view',orientation=(0,1,0,0.611),position=(3.5,1.6,3.5)),
    Viewpoint(DEF='LEFT_CORNER_DEF_NAME',description='Left corner view',orientation=(0,1,0,-0.611),position=(-3.5,1.6,3.5)),
    NavigationInfo(avatarSize=[2,1,0.5],headlight=False,speed=2,type='"WALK" "EXAMINE" "ANY"'),
    Inline(url=["../Chapter25LevelOfDetail/Figure25_12DungeonRoomsWithSlidingDoors.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_12DungeonRoomsWithSlidingDoors.x3d","../Chapter25LevelOfDetail/Figure25_12DungeonRoomsWithSlidingDoors.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_12DungeonRoomsWithSlidingDoors.wrl"]),
    Anchor(description='Click for right corner viewpoint',url=["#RIGHT_CORNER_DEF_NAME"],
      children=[
      Transform(rotation=(-0.95,0.22,0.22,1.62),translation=(1.75,0.6,0.15),
        children=[
        Collision(enabled=False,
          children=[
          Shape(
            geometry=Cone(bottomRadius=0.1,height=0.5),
            appearance=Appearance(
              material=Material(diffuseColor=(0.1,0.4,0.8),emissiveColor=(0,0.1,0.2),shininess=0.4,specularColor=(0.8,0.8,0.8))))])])]),
    Anchor(description='Click for left corner viewpoint',url=["#LEFT_CORNER_DEF_NAME"],
      children=[
      Transform(rotation=(-0.95,-0.22,-0.22,1.62),translation=(-1.75,0.6,0.15),
        children=[
        Collision(enabled=False,
          children=[
          Shape(
            geometry=Cone(bottomRadius=0.1,height=0.5),
            appearance=Appearance(
              material=Material(diffuseColor=(0.1,0.8,0.4),emissiveColor=(0,0.2,0.1),shininess=0.4,specularColor=(0.8,0.8,0.8))))])])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure28_1AnchorViewpointsDungeon.py:')
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

print("python Figure28_1AnchorViewpointsDungeon.py load and self-test diagnostics complete.")
