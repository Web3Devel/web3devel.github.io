####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Vector.py
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
    meta(content='Vector.x3d',name='title'),
    meta(content='Vector: this world illustrates the use of a Prototype declaration to define a generic vector whose position, orientation, scale, and color are all set by incoming fields. The vector is used by the VectorField1 example to fill a volume with visualization vectors, all pointing different directions and with different colors.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='VectorField1.x3d',name='reference'),
    meta(content='originals/vector.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0496.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Vector.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Vector'),
    ProtoDeclare(name='Vector',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='initializeOnly',name='color',type='SFColor',value=(0.8,0.8,0.8)),
        field(accessType='initializeOnly',name='rotation',type='SFRotation',value=(0.0,1.0,0.0,0.0)),
        field(accessType='initializeOnly',name='scale',type='SFVec3f',value=(1.0,1.0,1.0)),
        field(accessType='initializeOnly',name='translation',type='SFVec3f',value=(0.0,0.0,0.0))]),
      ProtoBody=ProtoBody(
        children=[
        Transform(
          IS=IS(
            connect=[
            connect(nodeField='translation',protoField='translation'),
            connect(nodeField='scale',protoField='scale'),
            connect(nodeField='rotation',protoField='rotation')]),
          children=[
          Shape(DEF='flatArrow',
            appearance=Appearance(
              material=Material(ambientIntensity=0.0,diffuseColor=(0.0,0.0,0.0),
                IS=IS(
                  connect=[
                  connect(nodeField='emissiveColor',protoField='color')]))),
            geometry=IndexedFaceSet(coordIndex=[0,1,2,3,0,-1,4,5,6,4],solid=False,
              coord=Coordinate(point=[(-0.1,0.0,0.0),(0.1,0.0,0.0),(0.1,0.75,0.0),(-0.1,0.75,0.0),(-0.25,0.75,0.0),(0.25,0.75,0.0),(0.0,1.0,0.0)]))),
          Transform(rotation=(0.0,1.0,0.0,1.57),
            children=[
            Shape(USE='flatArrow')])])])),
    #  Display scene instructions for viewing an example scene with a corresponding prototype instance 
    Background(skyColor=[(0,0.333333,0.66667)]),
    Anchor(description='select text to view parent scene',url=["VectorField1.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/VectorField1.x3d","VectorField1.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/VectorField1.wrl"],
      children=[
      Shape(
        geometry=Text(string=["The Vector.x3d scene holds","a prototype declaration","","Select this text to view example usage","in VectorField1.x3d scene"],
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

print('Self-test diagnostics for Vector.py:')
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

print("python Vector.py load and self-test diagnostics complete.")
