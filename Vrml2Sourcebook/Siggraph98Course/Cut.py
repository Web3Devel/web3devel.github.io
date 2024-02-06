####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Cut.py
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
    meta(content='Cut.x3d',name='title'),
    meta(content='Cutting plane parts: this file contains two prototype declarations used in creating a cutting plane. The example scene TexturePlane uses these for external prototype instances and creates a plane with one of a set of textures mapped to it. The texture choice is controlled by a fraction eventIn. SlidingPlane creates a texture plane that slides back and forth along the X axis, changing the texture based upon the X position.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='16 December 2023',name='modified'),
    meta(content='CutPlane.x3d',name='reference'),
    meta(content='TexturePlane.x3d',name='reference'),
    meta(content='originals/cut.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0497.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Cut.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Cutting Plane parts'),
    ProtoDeclare(name='TexturePlane',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='initializeOnly',name='textures',type='MFNode',
          #  initialized with ImageTexture nodes upon use 
          ),
        field(accessType='inputOnly',name='set_fraction',type='SFFloat')]),
      ProtoBody=ProtoBody(
        children=[
        Group(
          children=[
          Shape(
            appearance=Appearance(DEF='App'),
            geometry=IndexedFaceSet(coordIndex=[0,1,2,3],solid=False,texCoordIndex=[0,1,2,3],
              texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
              coord=Coordinate(point=[(-1.0,-1.0,0.0),(1.0,-1.0,0.0),(1.0,1.0,0.0),(-1.0,1.0,0.0)]))),
          Shape(
            appearance=Appearance(),
            geometry=IndexedLineSet(coordIndex=[0,1,2,3,0],
              coord=Coordinate(point=[(-1.0,-1.0,0.0),(1.0,-1.0,0.0),(1.0,1.0,0.0),(-1.0,1.0,0.0)])))]),
        #  ProtoBody child following first child will not be rendered, since the first child determines node type of this prototype. 
        Script(DEF='Selector',directOutput=True,
          field=[
          field(accessType='initializeOnly',name='textures',type='MFNode'),
          field(accessType='outputOnly',name='texture_changed',type='SFNode'),
          field(accessType='inputOnly',name='set_fraction',type='SFFloat')],
          IS=IS(
            connect=[
            connect(nodeField='textures',protoField='textures'),
            connect(nodeField='set_fraction',protoField='set_fraction')]),

        sourceCode="""
ecmascript:
    function initialize( ) {
        texture_changed = textures[0];
        Browser.println ('[Cut Selector] initialize(): textures.length=' + textures.length); // debug
    }
    function set_fraction( f, tm ) {
        i = Math.floor(f * 10);
        if ( i == 10 ) { i = 9; }
        Browser.println ('[Cut Selector] set_fraction(): i=' + i); // debug
        texture_changed = textures[i];
    }
"""),
        ROUTE(fromField='texture_changed',fromNode='Selector',toField='set_texture',toNode='App')])),
    ProtoDeclare(name='SlidingPlane',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='initializeOnly',name='textures',type='MFNode',
          #  initialized with ImageTexture nodes upon use 
          ),
        field(accessType='initializeOnly',name='minMaxX',type='SFVec2f',value=(0.0,1.0)),
        field(accessType='initializeOnly',name='initialX',type='SFFloat',value=0.0)]),
      ProtoBody=ProtoBody(
        children=[
        Transform(rotation=(0.0,1.0,0.0,1.571),
          children=[
          PlaneSensor(DEF='Slider',description='drag to see cross-section slices'),
          Transform(DEF='PlanePosition',rotation=(0.0,1.0,0.0,-1.571),
            children=[
            ProtoInstance(DEF='Plane',name='TexturePlane',
              IS=IS(
                connect=[
                connect(nodeField='textures',protoField='textures')])),
            Transform(rotation=(0.0,1.0,0.0,1.571),translation=(1.05,-1.2,0.0),
              children=[
              Shape(
                appearance=Appearance(),
                geometry=Text(DEF='Label',string=[""],
                  fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.3,style_='BOLD')))])])]),
        Script(DEF='Translator',
          field=[
          field(accessType='inputOnly',name='set_translation',type='SFVec3f'),
          field(accessType='initializeOnly',name='minMaxX',type='SFVec2f'),
          field(accessType='outputOnly',name='minPosition_changed',type='SFVec2f'),
          field(accessType='outputOnly',name='fraction_changed',type='SFFloat'),
          field(accessType='initializeOnly',name='initialX',type='SFFloat'),
          field(accessType='outputOnly',name='offset_changed',type='SFVec3f'),
          field(accessType='outputOnly',name='maxPosition_changed',type='SFVec2f'),
          field(accessType='outputOnly',name='label_changed',type='MFString')],
          IS=IS(
            connect=[
            connect(nodeField='minMaxX',protoField='minMaxX'),
            connect(nodeField='initialX',protoField='initialX')]),

        sourceCode="""
ecmascript:
        function translate( x ) {
        // compute the fraction using the given X position
            f = (x-minMaxX[0]) / (minMaxX[1] - minMaxX[0]);
        // send a fraction event
            fraction_changed = f;
        // send a new label string with 1 digit after decimal
            label_changed[0] = Math.floor(f*10.0)/10.0;
        }

        function initialize( ) {
        // set the plane sensor bounds
            minPosition_changed[0] = minMaxX[0];
            minPosition_changed[1] = 0.0;
            maxPosition_changed[0] = minMaxX[1];
            maxPosition_changed[1] = 0.0;
        // set the plane sensor initial position
            offset_changed[0] = initialX;
            offset_changed[1] = 0.0;
            offset_changed[2] = 0.0;
        // compute the initial values
            translate( initialX );
        }

        function set_translation( t, tm ) {
        // compute the new values
            translate( t[0] );
        }
"""),
        ROUTE(fromField='translation_changed',fromNode='Slider',toField='set_translation',toNode='PlanePosition'),
        ROUTE(fromField='translation_changed',fromNode='Slider',toField='set_translation',toNode='Translator'),
        ROUTE(fromField='fraction_changed',fromNode='Translator',toField='set_fraction',toNode='Plane'),
        ROUTE(fromField='label_changed',fromNode='Translator',toField='set_string',toNode='Label'),
        ROUTE(fromField='minPosition_changed',fromNode='Translator',toField='set_minPosition',toNode='Slider'),
        ROUTE(fromField='maxPosition_changed',fromNode='Translator',toField='set_maxPosition',toNode='Slider'),
        ROUTE(fromField='offset_changed',fromNode='Translator',toField='set_offset',toNode='Slider'),
        ROUTE(fromField='offset_changed',fromNode='Translator',toField='set_translation',toNode='PlanePosition')])),
    #  Display scene instructions for viewing an example scene with a corresponding prototype instance 
    Background(skyColor=[(0,0.333333,0.66667)]),
    Transform(translation=(0,2.5,0),
      children=[
      Anchor(description='select text to view parent scene',url=["CutPlane.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/CutPlane.x3d","CutPlane.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/CutPlane.wrl"],
        children=[
        Shape(
          geometry=Text(string=["The Cut.x3d scene holds","prototype declarations","Select this text to view example usage","in CutPlane.x3d scene"],
            fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],style_='BOLD')),
          appearance=Appearance(
            material=Material(diffuseColor=(1,0.9,0.4)))),
        #  Invisible box behind text makes selection easier 
        Shape(
          geometry=Box(size=(12,5,0.1)),
          appearance=Appearance(
            material=Material(transparency=1)))])]),
    Transform(translation=(0,-2.5,0),
      children=[
      Anchor(description='select text to view parent scene',url=["TexturePlane.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/TexturePlane.x3d","TexturePlane.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/TexturePlane.wrl"],
        children=[
        Shape(
          geometry=Text(string=["or select this text to view example usage","in TexturePlane.x3d scene"],
            fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],style_='BOLD')),
          appearance=Appearance(
            material=Material(diffuseColor=(1,0.9,0.4)))),
        #  Invisible box behind text makes selection easier 
        Shape(
          geometry=Box(size=(12,5,0.1)),
          appearance=Appearance(
            material=Material(transparency=1)))])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Cut.py:')
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

print("python Cut.py load and self-test diagnostics complete.")
