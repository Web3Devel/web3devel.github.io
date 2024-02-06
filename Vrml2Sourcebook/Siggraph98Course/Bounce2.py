####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Bounce2.py
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

newModel=X3D(profile='Immersive',version='3.3',
  head=head(
    children=[
    meta(content='Bounce2.x3d',name='title'),
    meta(content='Bouncing beachball (Java version): this world illustrates the use of a Script node to create a computed animation path. In particular, the Script node uses a Java program script to compute translation values for a vertically bouncing beach ball.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='3 November 2019',name='modified'),
    meta(content='originals/bounce2.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0457.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Bounce2.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/bounce2.htm 
    #  The bounce path is based upon the projectile motion equation of physics, constrained to create a cyclic bouncing path with a user-selected maximum bounce height. Also, there is no friction, drag, or damping. For an explanation of the script, see 'bounce1.wrl'. 
    #  Things to experiment with 
    #  Encapsulate the ball, script, timer, and sensors within a PROTO for a new node named "BouncingBall". Then use that new BouncingBall node multiple times to create multiple bouncing balls. Your PROTO interface might look like this: 
    #  PROTO BouncingBall [ field SFFloat bounceHeight 2.0 field SFTime cycleInterval 2.0 ] { . . . } 
    #  See 'bounce3.wrl', which implements such a PROTO. 
    #  - Add a shadow under the bouncing ball. To do this, add a circular, semi-transparent, black shape that doesn't bounce. To make the shadow more realistic, scale the shadow in the X and Z directions, shrinking it as the ball goes up, and increasing it as the ball comes down. You'll need to add another eventOut for the Script node and send an XYZ scaling factor triple out that eventOut. Try the following values for the XYZ scale values: 
    #  xzscale = 1.0 - 0.5 * y / bounceHeight; 
    #  shadowScale_changed[0] = xzscale; 
    #  shadowScale_changed[1] = 1.0; 
    #  shadowScale_changed[2] = xzscale; 
    #  See 'bounce4.wrl', which implements shadows using the above 
    #  - Add a sound to the PROTO so that each time the ball touches the ground, it makes a 'boing' sound. 
    #  - When the ball hits the ground, scale the ball slightly so that it appears to squish. 
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Bouncing beachball (Java)'),
    Viewpoint(description='Bouncing beachball, Java version',orientation=(1.0,0.0,0.0,0.1),position=(0.0,0.6,8.0)),
    NavigationInfo(headlight=False,speed=2.0),
    DirectionalLight(ambientIntensity=0.5,direction=(0.0,-1.0,-0.5)),
    Background(skyAngle=[1.371,1.571],skyColor=[(0.0,0.0,1.0),(0.0,0.5,1.0),(0.7,0.7,1.0)]),
    Shape(
      appearance=Appearance(
        textureTransform=TextureTransform(scale=(10.0,10.0)),
        material=Material(),
        texture=ImageTexture(url=["sand.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/sand.jpg"])),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3],solid=False,
        coord=Coordinate(point=[(-50.0,-1.0,50.0),(50.0,-1.0,50.0),(50.0,-1.0,-50.0),(-50.0,-1.0,-50.0)]))),
    Transform(translation=(-3.0,-1.0,-10.0),
      children=[
      Group(DEF='Palm',
        children=[
        Billboard(
          children=[
          Shape(
            appearance=Appearance(
              texture=ImageTexture(url=["palm.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/palm.png"])),
            geometry=IndexedFaceSet(coordIndex=[0,1,2,3],solid=False,texCoordIndex=[0,1,2,3],
              texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
              coord=Coordinate(point=[(-2.5,0.0,0.0),(2.5,0.0,0.0),(2.5,11.25,0.0),(-2.5,11.25,0.0)])))]),
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.0,0.0,0.0),transparency=0.5),
            texture=ImageTexture(url=["palmsh.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/palmsh.png"])),
          geometry=IndexedFaceSet(coordIndex=[0,1,2,3],solid=False,texCoordIndex=[0,1,2,3],
            texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
            coord=Coordinate(point=[(-2.5,0.05,2.5),(2.5,0.05,2.5),(2.5,0.05,-2.5),(-2.5,0.05,-2.5)])))])]),
    Transform(scale=(0.6,0.6,0.6),translation=(-5.0,-1.0,-6.0),
      children=[
      Group(USE='Palm')]),
    Transform(translation=(5.0,-1.0,-9.0),
      children=[
      Group(USE='Palm')]),
    Transform(translation=(10.0,-1.0,-15.0),
      children=[
      Group(USE='Palm')]),
    Transform(DEF='Ball',
      children=[
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(2.0,1.0)),
          material=Material(ambientIntensity=0.5,diffuseColor=(1.0,1.0,1.0),shininess=0.4,specularColor=(0.7,0.7,0.7)),
          texture=ImageTexture(url=["beach.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/beach.jpg"])),
        geometry=Sphere(),)]),
    TimeSensor(DEF='Clock',cycleInterval=2.0,loop=True,startTime=1.0),
    Script(DEF='Bouncer',url=["Bounce2Script.class","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Bounce2Script.class"],
      field=[
      field(accessType='outputOnly',name='value_changed',type='SFVec3f'),
      field(accessType='initializeOnly',name='bounceHeight',type='SFFloat',value=3.0),
      field(accessType='inputOnly',name='set_fraction',type='SFFloat')],

    sourceCode="""
ecmascript:

"""),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Bouncer'),
    ROUTE(fromField='value_changed',fromNode='Bouncer',toField='set_translation',toNode='Ball')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Bounce2.py:')
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

print("python Bounce2.py load and self-test diagnostics complete.")