package com.sxtx.ffmpeg;

import com.xuggle.xuggler.ICodec;
import com.xuggle.xuggler.IContainer;
import com.xuggle.xuggler.IStream;
import com.xuggle.xuggler.IStreamCoder;

public class getVedioInfo {

    public static void getVedioInfo(String filename){


        // first we create a Xuggler containerobject
        IContainer container =IContainer.make();

        // we attempt to open up thecontainer
        int result = container.open(filename,IContainer.Type.READ, null);

        // check if the operation wassuccessful
        if (result<0)
            return;

        // query how many streams the call to openfound
        int numStreams =container.getNumStreams();
        // query for the total duration
        long duration =container.getDuration();
        // query for the file size
        long fileSize =container.getFileSize();
        long secondDuration =duration/1000000;

        System.out.println("时长："+secondDuration+"秒");
        System.out.println("文件大小:"+fileSize+"M");


        for (int i=0; i<numStreams;i++){
            IStream IStreamstream = container.getStream(i);
            IStreamCoder coder = IStreamstream.getStreamCoder();
            if(coder.getCodecType() == ICodec.Type.CODEC_TYPE_VIDEO){
                System.out.println("视频宽度："+coder.getWidth());
                System.out.println("视频高度："+coder.getHeight());
            }
        }

    }

}
