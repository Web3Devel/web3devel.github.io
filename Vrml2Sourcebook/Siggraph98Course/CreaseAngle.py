####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python CreaseAngle.py
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
    meta(content='CreaseAngle.x3d',name='title'),
    meta(content='creaseAngle demonstration: select and drag upper halves of quadrilaterals to change creaseAngle and shading.',name='description'),
    meta(content='John L. Moreland',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/creangle.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0243.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/CreaseAngle.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["copyright (c) 1997, John L. Moreland"],title='Crease angle demonstration'),
    Viewpoint(centerOfRotation=(0,0.85,0),description='Front Face',orientation=(0,1,0,-0.62),position=(-2,0.85,3)),
    Viewpoint(centerOfRotation=(0,0.85,0),description='Back Face',orientation=(0.0,1.0,0.0,0.62),position=(2.4,0.85,3.0)),
    NavigationInfo(),
    DirectionalLight(color=(1.0,0.0,0.0),direction=(0.0,-1.0,0.1)),
    DirectionalLight(color=(0.0,0.0,1.0),direction=(0.0,1.0,-0.1)),
    Transform(translation=(-1.1,0.0,0.0),
      children=[
      Shape(
        appearance=Appearance(DEF='White',
          material=Material(ambientIntensity=0.5,diffuseColor=(1.0,1.0,1.0))),
        geometry=IndexedFaceSet(coordIndex=[0,1,4,5,0,-1,1,2,3,4,1,-1],solid=False,
          coord=Coordinate(DEF='Crd1',point=[(0.0,0.0,1.0),(0.0,1.0,1.0),(0.0,2.0,1.0),(0.0,2.0,-1.0),(0.0,1.0,-1.0),(0.0,0.0,-1.0)]))),
      Transform(translation=(0.0,1.0,1.2),
        children=[
        Billboard(
          children=[
          Shape(
            appearance=Appearance(DEF='FntColor',
              material=Material(diffuseColor=(1.0,0.0,0.0))),
            geometry=Text(string=["0.0"],
              fontStyle=FontStyle(DEF='FntStyle',justify=["BEGIN","MIDDLE"],size=0.1,style_='BOLD'))),
          Transform(DEF='bendAngleLabel',translation=(0.0,-0.1,0.0),
            children=[
            Shape(
              appearance=Appearance(
                material=Material(diffuseColor=(0.0,0.5,0.0))),
              geometry=Text(DEF='bendAngle',string=["0.0"],
                fontStyle=FontStyle(USE='FntStyle')))])])])]),
    Transform(
      children=[
      Shape(
        appearance=Appearance(USE='White'),
        geometry=IndexedFaceSet(coordIndex=[0,1,4,5,0,-1,1,2,3,4,1,-1],creaseAngle=0.785,solid=False,
          coord=Coordinate(DEF='Crd2',point=[(0.0,0.0,1.0),(0.0,1.0,1.0),(0.0,2.0,1.0),(0.0,2.0,-1.0),(0.0,1.0,-1.0),(0.0,0.0,-1.0)]))),
      Transform(translation=(0.0,1.0,1.2),
        children=[
        Billboard(
          children=[
          Shape(
            appearance=Appearance(USE='FntColor'),
            geometry=Text(string=["0.785"],
              fontStyle=FontStyle(USE='FntStyle'))),
          Transform(USE='bendAngleLabel')])])]),
    Transform(translation=(1.1,0.0,0.0),
      children=[
      Shape(
        appearance=Appearance(USE='White'),
        geometry=IndexedFaceSet(coordIndex=[0,1,4,5,0,-1,1,2,3,4,1,-1],creaseAngle=1.57,solid=False,
          coord=Coordinate(DEF='Crd3',point=[(0.0,0.0,1.0),(0.0,1.0,1.0),(0.0,2.0,1.0),(0.0,2.0,-1.0),(0.0,1.0,-1.0),(0.0,0.0,-1.0)]))),
      Transform(translation=(0.0,1.0,1.2),
        children=[
        Billboard(
          children=[
          Shape(
            appearance=Appearance(USE='FntColor'),
            geometry=Text(string=["1.57"],
              fontStyle=FontStyle(USE='FntStyle'))),
          Transform(USE='bendAngleLabel')])])]),
    PlaneSensor(DEF='PS',description='Select and drag upper halves of quads to change creaseAngle and shading',maxPosition=(6.283,1.57)),
    Script(DEF='Scr',
      field=[
      field(accessType='outputOnly',name='label_changed',type='MFString'),
      field(accessType='inputOnly',name='set_translation',type='SFVec3f'),
      field(accessType='outputOnly',name='fraction_changed',type='SFFloat')],

    sourceCode="""
ecmascript:
        function set_translation( tran, et )
        {
            tempCA = tran[0] / 4.0;
            if ( tempCA < 0.00 ) tempCA = 0.0;
            if ( tempCA > 1.57 ) tempCA = 1.57;
            fraction_changed = tempCA;
            // Hacks to get truncation/formatting
            tempCA = (Math.floor(tempCA*1000)/1000.0);
            if ( (tempCA > 0.1) && (tempCA < 1.0) )
                tempCA = '0' + tempCA;
            if ( tempCA <= 0.0 )
                tempCA = tempCA + '.' + '0';
            label_changed[0] = tempCA;
        }
"""),
    CoordinateInterpolator(DEF='CI',key=[0.0,1.57],keyValue=[(0.0,0.0,1.0),(0.0,1.0,1.0),(0.0,2.0,1.0),(0.0,2.0,-1.0),(0.0,1.0,-1.0),(0.0,0.0,-1.0),(0.0,0.0,1.0),(0.0,1.0,1.0),(1.0,1.0,1.0),(1.0,1.0,-1.0),(0.0,1.0,-1.0),(0.0,0.0,-1.0)]),
    ROUTE(fromField='translation_changed',fromNode='PS',toField='set_translation',toNode='Scr'),
    ROUTE(fromField='fraction_changed',fromNode='Scr',toField='set_fraction',toNode='CI'),
    ROUTE(fromField='label_changed',fromNode='Scr',toField='set_string',toNode='bendAngle'),
    ROUTE(fromField='value_changed',fromNode='CI',toField='set_point',toNode='Crd1'),
    ROUTE(fromField='value_changed',fromNode='CI',toField='set_point',toNode='Crd2'),
    ROUTE(fromField='value_changed',fromNode='CI',toField='set_point',toNode='Crd3')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for CreaseAngle.py:')
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

print("python CreaseAngle.py load and self-test diagnostics complete.")
