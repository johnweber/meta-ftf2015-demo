# Copyright (C) 2012 Freescale Semiconductor
# Copyright (C) 2014 John Weber
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "FTF2015 Demo Package Group"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES += " \
    ${PN}-base \
    ${PN}-test \
    ${PN}-gstreamer-base \
    ${PN}-gstreamer-video \
    ${PN}-gstreamer-video-bad \
    ${PN}-gstreamer-full \
"

RDEPENDS_${PN}-gstreamer-base = " \
    gstreamer1.0 \
    gstreamer1.0-plugins-base-playback \
    gstreamer1.0-plugins-base-alsa \
    gstreamer1.0-plugins-base-audioconvert \
    gstreamer1.0-plugins-base-audioresample \
    gstreamer1.0-plugins-base-gio \
    gstreamer1.0-plugins-base-typefindfunctions \
    gstreamer1.0-plugins-base-videoconvert \
    gstreamer1.0-plugins-base-videoscale \
    gstreamer1.0-plugins-base-volume \
    gstreamer1.0-plugins-good-autodetect \
    gstreamer1.0-plugins-base-audiotestsrc \
    gstreamer1.0-plugins-base-videotestsrc \
    gstreamer1.0-plugins-good-debug \
    gstreamer1.0-plugins-good-navigationtest \
    gstreamer1.0-plugins-base-tcp \
    gstreamer1.0-plugins-good-souphttpsrc \
    gstreamer1.0-plugins-good-udp \
    gstreamer1.0-plugins-good-rtp \
    gstreamer1.0-plugins-good-rtpmanager \
    gstreamer1.0-plugins-good-rtsp \
"

DEPENDS_${PN}-gstreamer-video = " \
    ${PN}-gstreamer-base \
    gstreamer1.0-plugins-base-subparse \
    gstreamer1.0-plugins-base-theora \
    gstreamer1.0-plugins-good-avi \
    gstreamer1.0-plugins-good-flv \
    gstreamer1.0-plugins-good-isomp4 \
    gstreamer1.0-plugins-good-matroska \
"

RDEPENDS_${PN}-gstreamer-video-bad = " \
    ${PN}-gstreamer-video \
    gstreamer1.0-plugins-bad-mpegpsdemux \
    gstreamer1.0-plugins-bad-mpegtsdemux \
    gstreamer1.0-plugins-bad-videoparsersbad \
"

RDEPENDS_${PN}-gstreamer-full = " \
    ${PN}-gstreamer-base \
    ${PN}-gstreamer-video-bad \
    gstreamer1.0-plugins-base-meta \
    gstreamer1.0-plugins-good-meta \
    gstreamer1.0-plugins-bad-meta \
    gstreamer1.0-plugins-imx-imxaudio \
    gstreamer1.0-plugins-imx-imxeglvivsink \
    gstreamer1.0-plugins-imx-imxg2d \
    gstreamer1.0-plugins-imx-meta \
"



RDEPENDS_${PN}-base = " \ 
    glive \
    lepton-utils \
    wtc-scripts \
"

RDEPENDS_${PN}-test = " \
    ${PN}-base \
    dropbear \
    elfutils \
    openssh-sftp-server \
    iperf \
    lmbench \
    v4l-utils \
    gst-meta-video \
    gst-plugins-good-video4linux2 \
    gst-plugins-base-ffmpegcolorspace \
    gst-plugins-good-videobox \
    gst-plugins-good-videomixer \
    gst-plugins-base-videotestsrc \
    ${PN}-gstreamer-full \
"

