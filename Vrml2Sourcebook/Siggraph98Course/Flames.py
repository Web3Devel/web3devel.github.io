####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Flames.py
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
    meta(content='Flames.x3d',name='title'),
    meta(content='Flickering flames: this prototype declaration illustrates the use of a script to cycle between textures, and then encapsulation of the script, a clock, and a polygon, all within a new Flames prototype node that makes flickering flames. See the Match.x3d scene for an example.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Match.x3d',name='reference'),
    meta(content='originals/flames.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0499.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Flames.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  Three flame textures are used: flames1.png flames2.png flames3.png 
    #  All three textures have a transparency channel (alpha channel) so that areas outside of the flame are transparent. 
    #  flame1.png was hand-drawn in PhotoShop. The other two flames were created by applying the PhotoShop 'Twirl' filter to several parts of the original flame. This creates a curling effect that looks vaugely flame-like. For a better effect, use more flame images and more care in applying the Twirl filter... or hand draw them all. 
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Flickering Flames'),
    ProtoDeclare(name='Flames',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='initializeOnly',name='startTime',type='SFTime',value=0.0),
        field(accessType='initializeOnly',name='cycleInterval',type='SFTime',value=1.0)]),
      ProtoBody=ProtoBody(
        children=[
        Shape(
          appearance=Appearance(DEF='FlameAppearance'),
          geometry=IndexedFaceSet(coordIndex=[0,1,2,3],solid=False,texCoordIndex=[0,1,2,3],
            texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
            coord=Coordinate(point=[(-0.5,0.0,0.0),(0.5,0.0,0.0),(0.5,1.8,0.0),(-0.5,1.8,0.0)]))),
        TimeSensor(DEF='Clock',loop=True,
          IS=IS(
            connect=[
            connect(nodeField='startTime',protoField='startTime'),
            connect(nodeField='cycleInterval',protoField='cycleInterval')])),
        Script(DEF='FlameSelector',directOutput=True,
          field=[
          field(accessType='initializeOnly',name='flameTextures',type='MFNode',
            children=[
            ImageTexture(DEF='Flame1',repeatS=False,repeatT=False,url=["flames1.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/flames1.png"]),
            ImageTexture(repeatS=False,repeatT=False,url=["flames2.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/flames2.png"]),
            ImageTexture(USE='Flame1'),
            ImageTexture(repeatS=False,repeatT=False,url=["flames3.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/flames3.png"])]),
          field(accessType='outputOnly',name='texture_changed',type='SFNode'),
          field(accessType='inputOnly',name='set_fraction',type='SFFloat')],

        sourceCode="""
ecmascript:
    function set_fraction( f, tm ) {
            if ( f < 0.25 )
                    texture_changed = flameTextures[0];
            else if ( f < 0.50 )
                    texture_changed = flameTextures[1];
            else if ( f < 0.75 )
                    texture_changed = flameTextures[2];
            else
                    texture_changed = flameTextures[3];
    }
"""),
        ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='FlameSelector'),
        ROUTE(fromField='texture_changed',fromNode='FlameSelector',toField='set_texture',toNode='FlameAppearance')])),
    #  Display scene instructions for viewing an example scene with a corresponding prototype instance 
    Background(skyColor=[(0,0.333333,0.66667)]),
    Anchor(description='select text to view parent scene',url=["Match.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Match.x3d","Match.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Match.wrl"],
      children=[
      Shape(
        geometry=Text(string=["The Flames.x3d scene holds","a prototype declaration","","Select this text to view example usage","in Match.x3d scene"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],style_='BOLD')),
        appearance=Appearance(
          material=Material(diffuseColor=(1,0.9,0.4)))),
      #  Invisible box behind text makes selection easier 
      Shape(
        geometry=Box(size=(12,5,0.1)),
        appearance=Appearance(
          material=Material(transparency=1)))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Flames.py:')
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

print("python Flames.py load and self-test diagnostics complete.")
