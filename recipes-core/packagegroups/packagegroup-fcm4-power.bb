SUMMARY = "Power and device management"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
  upower \
  udisks2 \
  polkit \
  seatd \
"
