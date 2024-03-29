####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python BarPlot.py
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
    meta(content='BarPlot.x3d',name='title'),
    meta(content='Demonstrate plotting values with 3D emphasis.',name='description'),
    meta(content='John L. Moreland',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='3 September 2023',name='modified'),
    meta(content='BarPlot.png',name='Image'),
    meta(content='originals/barplot.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0113.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/BarPlot.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["copyright (c) 1997, John L. Moreland"],title='3D Bar Plot'),
    Viewpoint(description='Entry view',position=(0.0,0.0,20.0)),
    NavigationInfo(),
    Transform(translation=(-14.5,-2.5,0.0),
      children=[
      Transform(
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.0,0.0,1.0))),
          geometry=Box(size=(1.0,0.00001,1.0)))]),
      Transform(translation=(0.0,0.47619,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["0.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(1.0,0.519779,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.207912,0.0,0.792089))),
          geometry=Box(size=(1.0,1.039558,1.0)))]),
      Transform(translation=(1.0,1.515748,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["1.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(2.0,1.016841,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.406736,0.0,0.593264))),
          geometry=Box(size=(1.0,2.033682,1.0)))]),
      Transform(translation=(2.0,2.509872,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["2.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(3.0,1.469462,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.587785,0.0,0.412215))),
          geometry=Box(size=(1.0,2.938924,1.0)))]),
      Transform(translation=(3.0,3.415115,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["2.9"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(4.0,1.857861,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.743144,0.0,0.256856))),
          geometry=Box(size=(1.0,3.715722,1.0)))]),
      Transform(translation=(4.0,4.191912,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["3.7"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(5.0,2.165062,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.866025,0.0,0.133975))),
          geometry=Box(size=(1.0,4.330125,1.0)))]),
      Transform(translation=(5.0,4.806315,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["4.3"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(6.0,2.37764,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.951056,0.0,0.048944))),
          geometry=Box(size=(1.0,4.755281,1.0)))]),
      Transform(translation=(6.0,5.231471,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["4.8"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(7.0,2.486305,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.994522,0.0,0.005478))),
          geometry=Box(size=(1.0,4.972609,1.0)))]),
      Transform(translation=(7.0,5.4488,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["5.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(8.0,2.486305,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.994522,0.0,0.005478))),
          geometry=Box(size=(1.0,4.97261,1.0)))]),
      Transform(translation=(8.0,5.4488,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["5.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(9.0,2.377643,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.951057,0.0,0.048943))),
          geometry=Box(size=(1.0,4.755285,1.0)))]),
      Transform(translation=(9.0,5.231476,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["4.8"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(10.0,2.165066,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.866026,0.0,0.133974))),
          geometry=Box(size=(1.0,4.330132,1.0)))]),
      Transform(translation=(10.0,4.806322,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["4.3"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(11.0,1.857865,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.743146,0.0,0.256854))),
          geometry=Box(size=(1.0,3.71573,1.0)))]),
      Transform(translation=(11.0,4.191921,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["3.7"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(12.0,1.469467,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.587787,0.0,0.412213))),
          geometry=Box(size=(1.0,2.938935,1.0)))]),
      Transform(translation=(12.0,3.415125,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["2.9"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(13.0,1.016847,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.406739,0.0,0.593261))),
          geometry=Box(size=(1.0,2.033694,1.0)))]),
      Transform(translation=(13.0,2.509884,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["2.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(14.0,0.519785,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.207914,0.0,0.792086))),
          geometry=Box(size=(1.0,1.03957,1.0)))]),
      Transform(translation=(14.0,1.51576,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["1.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(15.0,6.0E-6,0.0),
        children=[
        Shape(
          appearance=Appearance(
            #  diffuseColor value originally 3.0E-6 0.0 0.999997, simplified to avoid schema/regex validation error [0..1] 
            material=Material(diffuseColor=(0,0,1))),
          geometry=Box(size=(1.0,1.3E-5,1.0)))]),
      Transform(translation=(15.0,0.476203,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["0.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(16.0,-0.519772,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.207909,0.0,0.792091))),
          geometry=Box(size=(1.0,1.039545,1.0)))]),
      Transform(translation=(16.0,-1.515735,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-1.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(17.0,-1.016835,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.406734,0.0,0.593266))),
          geometry=Box(size=(1.0,2.033669,1.0)))]),
      Transform(translation=(17.0,-2.50986,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-2.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(18.0,-1.469457,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.587783,0.0,0.412217))),
          geometry=Box(size=(1.0,2.938913,1.0)))]),
      Transform(translation=(18.0,-3.415104,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-2.9"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(19.0,-1.857857,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.743143,0.0,0.256857))),
          geometry=Box(size=(1.0,3.715713,1.0)))]),
      Transform(translation=(19.0,-4.191904,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-3.7"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(20.0,-2.165059,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.866024,0.0,0.133976))),
          geometry=Box(size=(1.0,4.330118,1.0)))]),
      Transform(translation=(20.0,-4.806308,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-4.3"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(21.0,-2.377639,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.951055,0.0,0.048945))),
          geometry=Box(size=(1.0,4.755277,1.0)))]),
      Transform(translation=(21.0,-5.231468,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-4.8"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(22.0,-2.486304,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.994521,0.0,0.005479))),
          geometry=Box(size=(1.0,4.972608,1.0)))]),
      Transform(translation=(22.0,-5.448798,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-5.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(23.0,-2.486306,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.994522,0.0,0.005478))),
          geometry=Box(size=(1.0,4.972611,1.0)))]),
      Transform(translation=(23.0,-5.448802,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-5.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(24.0,-2.377645,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.951058,0.0,0.048942))),
          geometry=Box(size=(1.0,4.755289,1.0)))]),
      Transform(translation=(24.0,-5.23148,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-4.8"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(25.0,-2.165069,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.866028,0.0,0.133972))),
          geometry=Box(size=(1.0,4.330138,1.0)))]),
      Transform(translation=(25.0,-4.806329,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-4.3"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(26.0,-1.85787,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.743148,0.0,0.256852))),
          geometry=Box(size=(1.0,3.715739,1.0)))]),
      Transform(translation=(26.0,-4.19193,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-3.7"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(27.0,-1.469473,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.587789,0.0,0.412211))),
          geometry=Box(size=(1.0,2.938946,1.0)))]),
      Transform(translation=(27.0,-3.415136,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-2.9"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(28.0,-1.016852,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.406741,0.0,0.593259))),
          geometry=Box(size=(1.0,2.033704,1.0)))]),
      Transform(translation=(28.0,-2.509895,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-2.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])]),
      Transform(translation=(29.0,-0.519791,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.207916,0.0,0.792084))),
          geometry=Box(size=(1.0,1.039582,1.0)))]),
      Transform(translation=(29.0,-1.515773,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.8,0.8,0.0))),
            geometry=Text(string=["-1.0"],
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.454545)))])])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for BarPlot.py:')
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

print("python BarPlot.py load and self-test diagnostics complete.")
