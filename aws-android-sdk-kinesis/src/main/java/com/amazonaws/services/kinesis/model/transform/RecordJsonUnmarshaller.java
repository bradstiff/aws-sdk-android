/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesis.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * Record JSON Unmarshaller
 */
public class RecordJsonUnmarshaller implements Unmarshaller<Record, JsonUnmarshallerContext> {

    public Record unmarshall(JsonUnmarshallerContext context) throws Exception {
        Record record = new Record();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("SequenceNumber")) {
                record.setSequenceNumber(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("ApproximateArrivalTimestamp")) {
                record.setApproximateArrivalTimestamp(DateJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("Data")) {
                record.setData(ByteBufferJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("PartitionKey")) {
                record.setPartitionKey(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return record;
    }

    private static RecordJsonUnmarshaller instance;
    public static RecordJsonUnmarshaller getInstance() {
        if (instance == null) instance = new RecordJsonUnmarshaller();
        return instance;
    }
}
    