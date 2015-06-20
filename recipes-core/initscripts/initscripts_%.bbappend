FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI_append = " \
	file://gliveserver \
	file://leptoninit \
"

do_install_append () {
        install -m 0755 ${WORKDIR}/gliveserver ${D}${sysconfdir}/init.d/gliveserver
	install -m 0755 ${WORKDIR}/leptoninit ${D}${sysconfdir}/init.d/leptoninit
	update-rc.d -r ${D} gliveserver start 99 5 .
	update-rc.d -r ${D} leptoninit start 98 5 .
}

