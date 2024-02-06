####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure30_5ScriptTorusBuilder.py
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
    meta(content='Figure30_5ScriptTorusBuilder.x3d',name='title'),
    meta(content='Figure 30.5, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig05.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='28 September 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A torus shape built with a donut-maker program script. Also see Figures 31.6 and 31.7 for comparison.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_5ScriptTorusBuilder.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure30_5ScriptTorusBuilder.x3d'),
    Viewpoint(description='Torus',orientation=(1,0,0,-0.78),position=(0,5,5)),
    Group(
      children=[
      Shape(
        geometry=Extrusion(DEF='Donut',beginCap=False,convex=False,creaseAngle=1.57,endCap=False),
        appearance=Appearance(
          material=Material(diffuseColor=(0,0.4,0.8)))),
      Script(DEF='DonutMakerExternalScript',url=["donutmaker.js","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/donutmaker.js"],
        field=[
        field(accessType='initializeOnly',name='spineRadius',type='SFFloat',value=2),
        field(accessType='initializeOnly',name='crossSectionRadius',type='SFFloat',value=1),
        field(accessType='initializeOnly',name='spineResolution',type='SFInt32',value=16),
        field(accessType='initializeOnly',name='crossSectionResolution',type='SFInt32',value=16),
        field(accessType='inputOnly',name='set_spineRadius',type='SFFloat'),
        field(accessType='inputOnly',name='set_crossSectionRadius',type='SFFloat'),
        field(accessType='outputOnly',name='spine_changed',type='MFVec3f'),
        field(accessType='outputOnly',name='crossSection_changed',type='MFVec2f')],

      sourceCode="""
ecmascript:

"""),
      Script(DEF='DonutMakerInternalScript',
        field=[
        field(accessType='initializeOnly',name='spineRadius',type='SFFloat',value=2),
        field(accessType='initializeOnly',name='crossSectionRadius',type='SFFloat',value=1),
        field(accessType='initializeOnly',name='spineResolution',type='SFInt32',value=16),
        field(accessType='initializeOnly',name='crossSectionResolution',type='SFInt32',value=16),
        field(accessType='inputOnly',name='set_spineRadius',type='SFFloat'),
        field(accessType='inputOnly',name='set_crossSectionRadius',type='SFFloat'),
        field(accessType='outputOnly',name='spine_changed',type='MFVec3f'),
        field(accessType='outputOnly',name='crossSection_changed',type='MFVec2f')],

      sourceCode="""
ecmascript:

function initialize( ) {
    generateCrossSection( );
    generateSpine( );
}

function set_crossSectionRadius( csr, ts ) {
    crossSectionRadius = csr;
    generateCrossSection( );
//  Browser.println ('crossSectionRadius = ' + csr);
}

function set_spineRadius( sr, ts ) {
    spineRadius = sr;
    generateSpine( );
//  Browser.println ('spineRadius = ' + sr);
}

function generateCrossSection( ) {
    angle = 0.0;
    delta = (2 * 3.141592653) / crossSectionResolution;
    for ( i = 0; i <= crossSectionResolution; i++ ) {
        crossSection_changed[i][0] =  crossSectionRadius * Math.cos( angle );
        crossSection_changed[i][1] = -crossSectionRadius * Math.sin( angle );
        angle += delta;
    }
    // added code to make ends meet
    crossSection_changed[crossSectionResolution + 1][0] = crossSection_changed[0][0];
    crossSection_changed[crossSectionResolution + 1][1] = crossSection_changed[0][1];
}

function generateSpine( ) {
    angle = 0.0;
    delta = (2 * 3.141592653) / spineResolution;
    for ( i = 0; i <= spineResolution; i++ ) {
        spine_changed[i][0] =  spineRadius * Math.cos( angle );
        spine_changed[i][1] =  0.0;
        spine_changed[i][2] = -spineRadius * Math.sin( angle );
        angle += delta;
    }
    // added code to make ends meet
    spine_changed[spineResolution + 1][0] = spine_changed[0][0];
    spine_changed[spineResolution + 1][1] = 0.0;
    spine_changed[spineResolution + 1][2] = spine_changed[0][2];
}
""")]),
    #  Either ROUTE from DonutMakerExternalScript or DonutMakerInternalScript, both methods work 
    ROUTE(fromField='spine_changed',fromNode='DonutMakerInternalScript',toField='set_spine',toNode='Donut'),
    ROUTE(fromField='crossSection_changed',fromNode='DonutMakerInternalScript',toField='set_crossSection',toNode='Donut')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure30_5ScriptTorusBuilder.py:')
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

print("python Figure30_5ScriptTorusBuilder.py load and self-test diagnostics complete.")
