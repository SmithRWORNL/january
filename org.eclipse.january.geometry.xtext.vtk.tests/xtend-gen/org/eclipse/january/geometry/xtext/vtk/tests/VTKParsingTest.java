/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext.vtk.tests;

import com.google.inject.Inject;
import org.eclipse.january.geometry.Geometry;
import org.eclipse.january.geometry.xtext.vtk.tests.VTKInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(VTKInjectorProvider.class)
@SuppressWarnings("all")
public class VTKParsingTest {
  @Inject
  private ParseHelper<Geometry> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Geometry result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}