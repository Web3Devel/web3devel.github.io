####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Stairway.py
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

newModel=X3D(profile='Interactive',version='3.3',
  head=head(
    children=[
    meta(content='Stairway.x3d',name='title'),
    meta(content='The Stairway world uses a twisting, branching, floating stairway to lead the visitor to six doorways. Each doorway is a selectable anchor leading to another world.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='16 December 2023',name='modified'),
    meta(content='originals/stairwy.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0095.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Stairway.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  This world was *hand authored*, which is way tough to do given the number of stairs to be positioned and oriented. This accounts for the heavy use of DEF and USE and rather convoluted nested transforms. By using a world builder application (when they become available), you can position each stair or group of stairs interactively, instead of typing in translations and rotations and hoping they work out. 
    #  Things to experiment with: 
    #  Change the anchor urls to point to your own worlds. 
    #  Add a flock of birds following a path animated by a PositionInterpolator and an OrientationInterpolator. 
    #  Drop the sky background wall and replace it with a Background node. 
    #  Add sound. Perhaps a gentle wind with some occasional wind chimes. 
    children=[
    WorldInfo(info=["copyright (c) 1997, David R. Nadeau"],title='The Stairway'),
    Background(skyAngle=[1.37,1.57,1.77],skyColor=[(0.0,0.0,0.0),(0.0,0.0,0.0),(0.0,0.1,0.5),(0.0,0.0,0.0)]),
    Transform(scale=(0.4,0.4,0.4),
      children=[
      Viewpoint(description='Entry view',orientation=(1.0,0.0,0.0,0.1),position=(9.0,-5.0,25.0)),
      NavigationInfo(avatarSize=[0.5,4.0,1.5],headlight=False,speed=4.0,type='"WALK" "ANY"'),
      DirectionalLight(color=(0.0,0.3,1.0),direction=(-3.0,2.0,-1.0)),
      PointLight(ambientIntensity=0.3,location=(14.0,10.0,14.0)),
      Transform(translation=(5.0,-3.0,5.0),
        children=[
        Shape(DEF='Platform',
          appearance=Appearance(DEF='Marble',
            material=Material(diffuseColor=(1.0,1.0,1.0)),
            texture=ImageTexture(url=["marble_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/marble_g.jpg"])),
          geometry=Box(size=(4.0,0.25,4.0)))]),
      Transform(translation=(5.0,-2.5,2.5),
        children=[
        Group(DEF='ThreeUpStraightStairs',
          children=[
          Shape(DEF='Stair',
            appearance=Appearance(USE='Marble'),
            geometry=Box(size=(4.0,0.25,1.0))),
          Transform(translation=(0.0,0.5,-1.0),
            children=[
            Shape(USE='Stair')]),
          Transform(translation=(0.0,1.0,-2.0),
            children=[
            Shape(USE='Stair')])])]),
      Transform(translation=(5.0,-1.0,-0.5),
        children=[
        Group(USE='ThreeUpStraightStairs')]),
      Transform(translation=(5.0,0.5,-5.0),
        children=[
        Shape(USE='Platform')]),
      Transform(translation=(5.0,1.0,-7.5),
        children=[
        Group(USE='ThreeUpStraightStairs')]),
      Transform(translation=(5.0,5.0,-10.1),
        children=[
        Anchor(description='Temple of the Orb',url=["Temple.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Temple.x3d","Temple.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Temple.wrl"],
          children=[
          Group(DEF='Door',
            children=[
            Shape(
              appearance=Appearance(
                textureTransform=TextureTransform(scale=(1.0,2.0)),
                material=Material(diffuseColor=(1.0,1.0,1.0)),
                texture=ImageTexture(url=["panel.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/panel.jpg"])),
              geometry=Box(size=(3.0,6.0,0.2))),
            Transform(translation=(1.18,-0.0,0.2),
              children=[
              Shape(
                appearance=Appearance(
                  material=Material(diffuseColor=(1.0,1.0,1.0)),
                  texture=ImageTexture(url=["blur.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/blur.jpg"])),
                geometry=Sphere(radius=0.15))])])])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(2.5,1.0,-5.0),
        children=[
        Transform(DEF='ThreeUpRightCurvingStairs',translation=(5.0,0.0,0.0),
          children=[
          Transform(DEF='OffToLeftStair',translation=(-5.0,0.0,0.0),
            children=[
            Shape(USE='Stair')]),
          Transform(rotation=(0.0,1.0,0.0,-0.26),translation=(0.0,0.5,0.0),
            children=[
            Transform(USE='OffToLeftStair')]),
          Transform(rotation=(0.0,1.0,0.0,-0.52),translation=(0.0,1.0,0.0),
            children=[
            Transform(USE='OffToLeftStair')])])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(2.5,2.5,-5.0),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,-0.785),
          children=[
          Transform(USE='ThreeUpRightCurvingStairs')])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(2.5,4.0,-5.0),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,-1.57),
          children=[
          Transform(USE='ThreeUpRightCurvingStairs')])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(2.5,5.0,-5.0),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,-2.09),
          children=[
          Transform(translation=(0.0,3.0,-0.6),
            children=[
            Anchor(description='Primitives on Pedestals',url=["Primitives.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Primitives.x3d","Primitives.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Primitives.wrl"],
              children=[
              Group(USE='Door')])])])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(7.5,0.0,-5.0),
        children=[
        Transform(DEF='ThreeDownLeftCurvingStairs',translation=(5.0,0.0,0.0),
          children=[
          Transform(USE='OffToLeftStair'),
          Transform(rotation=(0.0,1.0,0.0,0.26),translation=(0.0,-0.5,0.0),
            children=[
            Transform(USE='OffToLeftStair')]),
          Transform(rotation=(0.0,1.0,0.0,0.52),translation=(0.0,-1.0,0.0),
            children=[
            Transform(USE='OffToLeftStair')])])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(7.5,-1.5,-5.0),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,0.785),
          children=[
          Transform(USE='ThreeDownLeftCurvingStairs')])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(7.5,-2.5,-5.0),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,1.31),
          children=[
          Transform(rotation=(0.0,1.0,0.0,3.14),translation=(0.0,3.0,0.6),
            children=[
            Anchor(description='The Doorway',url=["Doorway.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Doorway.x3d","Doorway.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Doorway.wrl"],
              children=[
              Group(USE='Door')])])])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(2.5,-2.5,5.0),
        children=[
        Group(USE='ThreeUpStraightStairs')]),
      Transform(translation=(-2.0,-1.0,5.0),
        children=[
        Shape(USE='Platform')]),
      Transform(translation=(-2.0,-0.5,2.5),
        children=[
        Transform(DEF='ThreeUpLeftCurvingStairs',translation=(-5.0,0.0,0.0),
          children=[
          Transform(DEF='OffToRightStair',translation=(5.0,0.0,0.0),
            children=[
            Shape(USE='Stair')]),
          Transform(rotation=(0.0,1.0,0.0,0.26),translation=(0.0,0.5,0.0),
            children=[
            Transform(USE='OffToRightStair')]),
          Transform(rotation=(0.0,1.0,0.0,0.52),translation=(0.0,1.0,0.0),
            children=[
            Transform(USE='OffToRightStair')])])]),
      Transform(translation=(-2.0,0.5,2.5),
        children=[
        Transform(center=(-5.0,0.0,0.0),rotation=(0.0,1.0,0.0,0.52),
          children=[
          Transform(translation=(0.0,3.0,-0.6),
            children=[
            Anchor(description='Monolith World',url=["Monolith.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Monolith.x3d","Monolith.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Monolith.wrl"],
              children=[
              Group(USE='Door')])])])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(-4.5,-0.5,5.0),
        children=[
        Group(USE='ThreeUpStraightStairs')]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(-7.5,1.0,5.0),
        children=[
        Group(USE='ThreeUpStraightStairs')]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(-10.1,5.0,5.0),
        children=[
        Anchor(description='The Tower',url=["Towers.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Towers.x3d","Towers.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Towers.wrl"],
          children=[
          Group(USE='Door')])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(9.5,-4.5,5.0),
        children=[
        Group(USE='ThreeUpStraightStairs')]),
      Transform(translation=(12.0,-5.0,5.0),
        children=[
        Shape(USE='Platform')]),
      Transform(translation=(12.0,-6.5,9.5),
        children=[
        Group(USE='ThreeUpStraightStairs')]),
      Transform(translation=(12.0,-7.0,12.0),
        children=[
        Shape(USE='Platform')]),
      Transform(translation=(12.0,-8.5,16.5),
        children=[
        Group(USE='ThreeUpStraightStairs')]),
      Transform(rotation=(0.0,1.0,0.0,3.14),translation=(5.0,-3.5,7.5),
        children=[
        Transform(DEF='ThreeDownRightCurvingStairs',translation=(5.0,0.0,0.0),
          children=[
          Transform(USE='OffToLeftStair'),
          Transform(rotation=(0.0,1.0,0.0,-0.26),translation=(0.0,-0.5,0.0),
            children=[
            Transform(USE='OffToLeftStair')]),
          Transform(rotation=(0.0,1.0,0.0,-0.52),translation=(0.0,-1.0,0.0),
            children=[
            Transform(USE='OffToLeftStair')])])]),
      Transform(rotation=(0.0,1.0,0.0,3.14),translation=(5.0,-5.0,7.5),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,-0.785),
          children=[
          Transform(USE='ThreeDownRightCurvingStairs')])]),
      Transform(translation=(5.0,-6.0,7.5),
        children=[
        Transform(center=(-5.0,0.0,0.0),rotation=(0.0,1.0,0.0,-1.48),
          children=[
          Transform(rotation=(0.0,1.0,0.0,3.14),translation=(0.0,3.0,-0.6),
            children=[
            Anchor(description='Robot Bill',url=["RoboBill.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/RoboBill.x3d","RoboBill.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/RoboBill.wrl"],
              children=[
              Group(USE='Door')])])])]),
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(20.0,20.0)),
          material=Material(ambientIntensity=0.3),
          texture=ImageTexture(url=["stone2.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/stone2.jpg"])),
        geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1],solid=False,
          coord=Coordinate(point=[(-30.0,-9.0,30.0),(30.0,-9.0,30.0),(30.0,-9.0,-30.0),(-30.0,-9.0,-30.0)]))),
      Shape(
        appearance=Appearance(DEF='ShadowColor',
          material=Material(ambientIntensity=0.0,diffuseColor=(0.1,0.1,0.1),transparency=0.25)),
        geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1,4,5,6,7,-1,8,9,10,11,-1],
          coord=Coordinate(point=[(10.0,-8.5,17.0),(14.0,-8.5,17.0),(14.0,-8.5,3.0),(10.0,-8.5,3.0),(-10.0,-8.5,7.0),(10.0,-8.5,7.0),(10.0,-8.5,3.0),(-10.0,-8.5,3.0),(3.0,-8.5,7.0),(7.0,-8.5,7.0),(7.0,-8.5,-10.0),(3.0,-8.5,-10.0)]))),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(2.5,-8.5,-5.0),
        children=[
        Transform(DEF='ThreeUpRightCurvingShadows',translation=(5.0,0.0,0.0),
          children=[
          Transform(DEF='OffToLeftShadow',translation=(-5.0,0.0,0.0),
            children=[
            Shape(DEF='Shadow',
              appearance=Appearance(USE='ShadowColor'),
              geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1],
                coord=Coordinate(point=[(-2.0,0.0,0.5),(2.0,0.0,0.5),(2.0,0.0,-0.5),(-2.0,0.0,-0.5)])))]),
          Transform(rotation=(0.0,1.0,0.0,-0.26),
            children=[
            Transform(USE='OffToLeftShadow')]),
          Transform(rotation=(0.0,1.0,0.0,-0.52),
            children=[
            Transform(USE='OffToLeftShadow')])])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(2.5,-8.5,-5.0),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,-0.785),
          children=[
          Transform(USE='ThreeUpRightCurvingShadows')])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(2.5,-8.5,-5.0),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,-1.57),
          children=[
          Transform(USE='ThreeUpRightCurvingShadows')])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(7.5,-8.5,-5.0),
        children=[
        Transform(DEF='ThreeDownLeftCurvingShadows',translation=(5.0,0.0,0.0),
          children=[
          Transform(USE='OffToLeftShadow'),
          Transform(rotation=(0.0,1.0,0.0,0.26),
            children=[
            Transform(USE='OffToLeftShadow')]),
          Transform(rotation=(0.0,1.0,0.0,0.52),
            children=[
            Transform(USE='OffToLeftShadow')])])]),
      Transform(rotation=(0.0,1.0,0.0,1.57),translation=(7.5,-8.5,-5.0),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,0.785),
          children=[
          Transform(USE='ThreeDownLeftCurvingShadows')])]),
      Transform(translation=(-2.0,-8.5,2.5),
        children=[
        Transform(DEF='ThreeUpLeftCurvingShadows',translation=(-5.0,0.0,0.0),
          children=[
          Transform(DEF='OffToRightShadow',translation=(5.0,0.0,0.0),
            children=[
            Shape(USE='Shadow')]),
          Transform(rotation=(0.0,1.0,0.0,0.26),
            children=[
            Transform(USE='OffToRightShadow')]),
          Transform(rotation=(0.0,1.0,0.0,0.52),
            children=[
            Transform(USE='OffToRightShadow')])])]),
      Transform(rotation=(0.0,1.0,0.0,3.14),translation=(5.0,-8.5,7.5),
        children=[
        Transform(DEF='ThreeDownRightCurvingShadows',translation=(5.0,0.0,0.0),
          children=[
          Transform(USE='OffToLeftShadow'),
          Transform(rotation=(0.0,1.0,0.0,-0.26),
            children=[
            Transform(USE='OffToLeftShadow')]),
          Transform(rotation=(0.0,1.0,0.0,-0.52),
            children=[
            Transform(USE='OffToLeftShadow')])])]),
      Transform(rotation=(0.0,1.0,0.0,3.14),translation=(5.0,-8.5,7.5),
        children=[
        Transform(center=(5.0,0.0,0.0),rotation=(0.0,1.0,0.0,-0.785),
          children=[
          Transform(USE='ThreeDownRightCurvingShadows')])])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Stairway.py:')
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

print("python Stairway.py load and self-test diagnostics complete.")
