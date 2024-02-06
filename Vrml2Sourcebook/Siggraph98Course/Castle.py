####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Castle.py
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
    meta(content='Castle.x3d',name='title'),
    meta(content='A fairy-tale castle atop a green hill with a blue sky behind. There are no animations or fun things to click on... building those is up to you.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/castle.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0000.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Castle.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  This world illustrates how far you can go using the primitive geometry nodes: Box, Cone, and Cylinder. An entire fairy-tale castle is built by translating and rotating these shapes into position. 
    #  Things to experiment with... 
    #  Change the color scheme to make the castle an evil lair. 
    #  Add texture maps to make the castle walls look like they are built from stone. 
    #  Make the castle door an anchor. Clicking on the door leads to another world describing the castle interior. 
    #  Add panorama cloud and mountain textures to the Background node. 
    #  In Nintendo 64 style, add platforms that rise and fall and cannons that rise up when you approach. You can build these using PositionInterpolators and TimeSensors to run the animations, and ProximitySensors to trigger the actions. 
    children=[
    WorldInfo(info=["copyright (c) 1997, David R. Nadeau"],title='Fairy-tale Castle'),
    Viewpoint(description='Entry view',orientation=(1.0,0.0,0.0,0.35)),
    NavigationInfo(speed=40.0),
    Transform(translation=(0.0,-1.6,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,0.0,0.0),emissiveColor=(0.0,0.5,0.0))),
        geometry=Box(size=(2000.0,0.01,2000.0)))]),
    Transform(DEF='Castle',translation=(0.0,-1.6,-200.0),
      children=[
      Transform(translation=(0.0,20.0,0.0),
        children=[
        Shape(
          appearance=Appearance(DEF='CastleColor',
            material=Material(ambientIntensity=0.5,diffuseColor=(1.0,1.0,1.0))),
          geometry=Cylinder(bottom=False,height=40.0,radius=50.0))]),
      Transform(translation=(0.0,0.0,52.0),
        children=[
        Transform(translation=(0.0,10.0,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='CastleColor'),
            geometry=Box(size=(30.0,20.0,6.0)))]),
        Transform(translation=(0.0,5.0,3.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.4,0.1,0.0))),
            geometry=Box(size=(10.0,10.0,0.5)))]),
        Transform(translation=(-15.0,0.0,3.0),
          children=[
          Transform(DEF='EntryTower',translation=(0.0,15.0,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='CastleColor'),
              geometry=Cylinder(bottom=False,height=30.0,radius=5.0,top=False))]),
          Transform(DEF='EntryRoof',translation=(0.0,40.0,0.0),
            children=[
            Shape(
              appearance=Appearance(DEF='RoofColor',
                material=Material(ambientIntensity=0.5,diffuseColor=(1.0,0.0,0.0))),
              geometry=Cone(bottomRadius=8.0,height=20.0))])]),
        Transform(translation=(15.0,0.0,3.0),
          children=[
          Transform(USE='EntryTower'),
          Transform(USE='EntryRoof')])]),
      Transform(translation=(-15.0,40.0,-5.0),
        children=[
        Transform(translation=(0.0,30.0,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='CastleColor'),
            geometry=Cylinder(bottom=False,height=60.0,radius=25.0))]),
        Transform(translation=(0.0,100.0,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='CastleColor'),
            geometry=Cylinder(bottom=False,height=80.0,radius=15.0,top=False))]),
        Transform(translation=(0.0,170.0,0.0),
          children=[
          Shape(DEF='MainRoofCone',
            appearance=Appearance(USE='RoofColor'),
            geometry=Cone(bottomRadius=23.0,height=60.0))])]),
      Transform(translation=(20.0,40.0,15.0),
        children=[
        Transform(translation=(0.0,50.0,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='CastleColor'),
            geometry=Cylinder(bottom=False,height=100.0,radius=15.0,top=False))]),
        Transform(translation=(0.0,130.0,0.0),
          children=[
          Shape(USE='MainRoofCone')]),
        Transform(translation=(0.0,30.0,15.0),
          children=[
          Transform(DEF='SmallSubTower',translation=(0.0,25.0,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='CastleColor'),
              geometry=Cylinder(bottom=False,height=30.0,radius=5.0,top=False))]),
          Transform(DEF='SmallSubBase',rotation=(1.0,0.0,0.0,3.14159),translation=(0.0,5.0,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='CastleColor'),
              geometry=Cone(bottom=False,bottomRadius=5.0,height=10.0))]),
          Transform(DEF='SmallSubRoof',translation=(0.0,50.0,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='RoofColor'),
              geometry=Cone(bottomRadius=8.0,height=20.0))])])]),
      Transform(translation=(50.0,20.0,0.0),
        children=[
        Transform(DEF='LargeSubTower',translation=(0.0,60.0,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='CastleColor'),
            geometry=Cylinder(bottom=False,height=80.0,radius=10.0,top=False))]),
        Transform(DEF='LargeSubBase',rotation=(1.0,0.0,0.0,3.14159),translation=(0.0,10.0,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='CastleColor'),
            geometry=Cone(bottom=False,bottomRadius=10.0,height=20.0))]),
        Transform(DEF='LargeSubRoof',translation=(0.0,120.0,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='RoofColor'),
            geometry=Cone(bottomRadius=15.0,height=40.0))]),
        Transform(translation=(10.0,40.0,0.0),
          children=[
          Transform(USE='SmallSubTower'),
          Transform(USE='SmallSubBase'),
          Transform(USE='SmallSubRoof')])]),
      Transform(translation=(-35.36,20.0,35.36),
        children=[
        Transform(USE='LargeSubTower'),
        Transform(USE='LargeSubBase'),
        Transform(USE='LargeSubRoof'),
        Transform(translation=(-7.07,40.0,7.07),
          children=[
          Transform(USE='SmallSubTower'),
          Transform(USE='SmallSubBase'),
          Transform(USE='SmallSubRoof')])]),
      Transform(translation=(0.0,20.0,-50.0),
        children=[
        Transform(USE='LargeSubTower'),
        Transform(USE='LargeSubBase'),
        Transform(USE='LargeSubRoof'),
        Transform(translation=(0.0,40.0,-10.0),
          children=[
          Transform(USE='SmallSubTower'),
          Transform(USE='SmallSubBase'),
          Transform(USE='SmallSubRoof')])])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Castle.py:')
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

print("python Castle.py load and self-test diagnostics complete.")
