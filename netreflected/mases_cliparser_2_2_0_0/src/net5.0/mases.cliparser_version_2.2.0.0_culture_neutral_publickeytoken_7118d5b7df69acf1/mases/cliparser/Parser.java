/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package mases.cliparser;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import mases.cliparser.IArgumentMetadataParsed;
import mases.cliparser.IArgumentMetadataParsedImplementation;
import mases.cliparser.Parser;
import mases.cliparser.Settings;
import mases.cliparser.IArgumentMetadata;
import mases.cliparser.IArgumentMetadataImplementation;


/**
 * The base .NET class managing MASES.CLIParser.Parser, MASES.CLIParser, Version=2.2.0.0, Culture=neutral, PublicKeyToken=7118d5b7df69acf1.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MASES.CLIParser.Parser" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MASES.CLIParser.Parser</a>
 */
public class Parser extends NetObject  {
    /**
     * Fully assembly qualified name: MASES.CLIParser, Version=2.2.0.0, Culture=neutral, PublicKeyToken=7118d5b7df69acf1
     */
    public static final String assemblyFullName = "MASES.CLIParser, Version=2.2.0.0, Culture=neutral, PublicKeyToken=7118d5b7df69acf1";
    /**
     * Assembly name: MASES.CLIParser
     */
    public static final String assemblyShortName = "MASES.CLIParser";
    /**
     * Qualified class name: MASES.CLIParser.Parser
     */
    public static final String className = "MASES.CLIParser.Parser";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }
    /**
     * Internal constructor. Use with caution 
     */
    public Parser(java.lang.Object instance) throws Throwable {
        super(instance);
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public java.lang.Object getJCOInstance() {
        return classInstance;
    }

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Parser}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Parser} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Parser cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Parser(from.getJCOInstance());
    }

    // Constructors section
    
    public Parser() throws Throwable {
    }



    
    // Methods section
    
    public int PaddingFromArguments() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("PaddingFromArguments");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Parser CreateInstance(Settings settings) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", settings == null ? null : settings.getJCOInstance());
            return new Parser(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(IArgumentMetadata metadata) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Add", metadata == null ? null : metadata.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public Settings getSettings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Settings");
            return new Settings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSettings(Settings Settings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Settings", Settings == null ? null : Settings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getUnparsedArgs() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("UnparsedArgs");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexUnparsedArgs = 0; indexUnparsedArgs < resultingArrayList.size(); indexUnparsedArgs++ ) {
				resultingArray[indexUnparsedArgs] = (java.lang.String)resultingArrayList.get(indexUnparsedArgs);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnparsedArgs(java.lang.String[] UnparsedArgs) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UnparsedArgs", UnparsedArgs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}