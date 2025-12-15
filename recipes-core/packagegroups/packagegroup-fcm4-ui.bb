SUMMARY = "UI stack for phone-like OS (Phosh on Wayland)"
DESCRIPTION = "Wayland compositor, shell, and required GNOME plumbing"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
  phosh \
  phoc \
  wlroots \
  wayland \
  wayland-protocols \
  dbus \
  dbus-broker \
  gsettings-desktop-schemas \
  xdg-user-dirs \
  xdg-user-dirs-data \
  xkeyboard-config \
  fonts-dejavu-sans \
  adwaita-icon-theme \
"
