SUMMARY = "Base system packages for phone-like OS"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
  busybox \
  util-linux \
  shadow \
  sudo \
  tzdata \
  systemd \
  systemd-serialgetty \
  systemd-analyze \
  chrony \
  logrotate \
  dbus \
  dbus-broker \
  libinput \
  seatd \
  upower \
  polkit \
"
