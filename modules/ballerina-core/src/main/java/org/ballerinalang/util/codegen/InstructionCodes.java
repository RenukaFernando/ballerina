/*
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.util.codegen;

/**
 * Bytecode instructions of a Ballerina compiled program.
 *
 * @since 0.87
 */
public interface InstructionCodes {
    
    int NOP = 0;
    int ICONST = 2;
    int FCONST = 3;
    int SCONST = 4;
    int ICONST_0 = 5;
    int ICONST_1 = 6;
    int ICONST_2 = 7;
    int ICONST_3 = 8;
    int ICONST_4 = 9;
    int ICONST_5 = 10;
    int FCONST_0 = 11;
    int FCONST_1 = 12;
    int FCONST_2 = 13;
    int FCONST_3 = 14;
    int FCONST_4 = 15;
    int FCONST_5 = 16;
    int BCONST_0 = 17;
    int BCONST_1 = 18;
    int RCONST_NULL = 19;

    int ILOAD = 22;
    int FLOAD = 23;
    int SLOAD = 24;
    int BLOAD = 25;
    int RLOAD = 26;
    int IALOAD = 27;
    int FALOAD = 28;
    int SALOAD = 29;
    int BALOAD = 30;
    int RALOAD = 31;
    int JSONALOAD = 32;
    int IGLOAD = 33;
    int FGLOAD = 34;
    int SGLOAD = 35;
    int BGLOAD = 36;
    int RGLOAD = 37;

    int ISTORE = 38;
    int FSTORE = 39;
    int SSTORE = 40;
    int BSTORE = 41;
    int RSTORE = 42;
    int IASTORE = 43;
    int FASTORE = 44;
    int SASTORE = 45;
    int BASTORE = 46;
    int RASTORE = 47;
    int JSONASTORE = 48;
    int IGSTORE = 49;
    int FGSTORE = 50;
    int SGSTORE = 51;
    int BGSTORE = 52;
    int RGSTORE = 53;

    int IFIELDLOAD = 54;
    int FFIELDLOAD = 55;
    int SFIELDLOAD = 56;
    int BFIELDLOAD = 57;
    int RFIELDLOAD = 58;

    int IFIELDSTORE = 60;
    int FFIELDSTORE = 61;
    int SFIELDSTORE = 62;
    int BFIELDSTORE = 63;
    int RFIELDSTORE = 64;

    // mapload map_reg_index key value_reg_index
    int MAPLOAD = 65;
    // mapstore map_reg_index key value_reg_index
    int MAPSTORE = 66;

    // jsonload json_reg_index key json_value_reg_index
    int JSONLOAD = 67;
    int JSONSTORE = 68;

    int IADD = 70;
    int FADD = 71;
    int SADD = 72;
    int ISUB = 73;
    int FSUB = 74;
    int IMUL = 75;
    int FMUL = 76;
    int IDIV = 77;
    int FDIV = 78;
    int IMOD = 79;
    int FMOD = 80;
    int INEG = 81;
    int FNEG = 82;

    int ICMP = 100;
    int FCMP = 101;
    int SCMP = 102;
    int BCMP = 103;
    int IFEQ = 110;
    int IFNE = 111;
    int IFLT = 112;
    int IFGE = 113;
    int IFGT = 114;
    int IFLE = 115;

    int GOTO = 119;
    int CALL = 120;
    int ACALL = 121;
    int RET = 125;

    // Type Cast/Conversion related instructions
    int I2F = 130;
    int I2S = 131;
    int I2B = 132;
    int I2ANY = 133;
    int I2JSON = 134;
    int F2I = 135;
    int F2S = 136;
    int F2B = 137;
    int F2ANY = 138;
    int F2JSON = 139;
    int S2I = 140;
    int S2F = 141;
    int S2B = 142;
    int S2ANY = 143;
    int S2JSON = 144;
    int B2I = 145;
    int B2F = 146;
    int B2S = 147;
    int B2ANY = 148;
    int B2JSON = 149;
    int JSON2I = 150;
    int JSON2F = 151;
    int JSON2S = 152;
    int JSON2B = 153;

    // Type cast
    int ANY2I = 154;
    int ANY2F = 155;
    int ANY2S = 156;
    int ANY2B = 157;
    int ANY2JSON = 158;
    int ANY2MAP = 159;
    int NULL2JSON = 160;

    int INEWARRAY = 200;
    int FNEWARRAY = 201;
    int SNEWARRAY = 202;
    int BNEWARRAY = 203;
    int RNEWARRAY = 204;
    int JSONNEWARRAY = 205;

    int NEWSTRUCT = 210;
    int NEWCONNECTOR = 211;
    int NEWMAP = 212;
    int NEWJSON = 213;

    int INSTRUCTION_CODE_COUNT = 214;
}